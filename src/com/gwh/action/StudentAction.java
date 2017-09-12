package com.gwh.action;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.gwh.pojo.Student;
import com.gwh.service.service;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 用户管理控制器
 * */
public class StudentAction extends ActionSupport {

	private static final long serialVersionUID = -281275682819237996L;
	
	private Student user = new Student(); 
	
	@SuppressWarnings("rawtypes")
	private service<Student> StudentService;
	
	private List<Student> users;
	
	private String searchText;
	
	
	public String doLogin() throws UnsupportedEncodingException
	{
		System.out.println(user.getSId());
		System.out.println(user.getSPassword());
		if(this.user.getSId() == null || this.user.getSPassword() == null) 
			return INPUT;
		ActionContext actionContext=ActionContext.getContext();
		Map<String,Object> sessions= actionContext.getSession();
		try 
		{
			System.out.println(1);
			
			Student user = StudentService.doLogin(this.user.getSId(), this.user.getSPassword());

				
			System.out.println(1);
			if(user != null)
			{
				ActionContext.getContext().getSession().put("Student", user);
				ActionContext.getContext().getSession().put("sid", user.getSId());
				return doQuery();
			}
			else
				return INPUT;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return ERROR;
		}	
	}
	
	public String doQuery() throws Exception{
		searchText = getParam("queryText");
		users = StudentService.queryUsers(searchText,Student.class);
		return SUCCESS;
	}
	
	@SuppressWarnings("unchecked")
	public String doQuery2() throws Exception{
		System.out.println(1111);
		String sid=getParam("ssid");
		System.out.println(sid);
		user = StudentService.getUser(Student.class,sid);
		System.out.println(2222);
	    return SUCCESS;
	}
	
	public String doAdd()
	{
		String result = "";
		
		try {
			String param = getParam("param");
			if(Integer.parseInt(param) > 0){
				StudentService.addUser(user);
				result = doQuery();
			}else
				result = "addUser";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
public String doEdit() throws Exception{
		try {
			Integer param = Integer.parseInt(getParam("param"));
			if(param == 0){
				String sid = getParam("ssid");
				System.out.println(sid);
				user = (Student) StudentService.getUser(Student.class, sid);
				return "editUser";
			}else if(param == 1){
				System.out.println("修改");
				StudentService.modifyUser(user);
				System.out.println(user.getSId());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doQuery();
	}
	public String doDelete() throws Exception{
		try {
			String sid = getParam("ssid");
			StudentService.deleteUser(sid,Student.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doQuery();
	}
	
	protected String getParam(String key)
	{
		return ServletActionContext.getRequest().getParameter(key);
	}
	

	public String getSearchText() {
		return searchText;
	}

	public Student getUser() {
		return user;
	}

	public void setUser(Student user) {
		this.user = user;
	}

	

	public service<Student> getStudentService()
	{
		return StudentService;
	}

	public void setStudentService(service<Student> studentService)
	{
		StudentService = studentService;
	}

	public List<Student> getUsers() {
		return users;
	}

	public void setUsers(List<Student> users) {
		this.users = users;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}

}

