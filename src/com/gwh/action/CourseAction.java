package com.gwh.action;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.gwh.pojo.Course;
import com.gwh.service.courseService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 用户管理控制器
 * */

public class CourseAction  extends ActionSupport {

	private static final long serialVersionUID = -281275682819237996L;
	
	private Course co = new Course(); 
	
	@SuppressWarnings("rawtypes")
	private courseService<Course> coService;
	
	private List<Course> course;
	
	private String searchText;
	
	public String doQuery() throws Exception{
		searchText = getParam("queryText");
		course = coService.queryCourses(searchText,Course.class);
		return SUCCESS;
	}
	
	@SuppressWarnings("unchecked")
	public String doQuery2() throws Exception{
		System.out.println(1111);
		String coid=getParam("ccid");
		System.out.println(coid);
		co = coService.getCourse(Course.class,coid);
		System.out.println(co.getC0Name());
	    return SUCCESS;
	}
	
	public String doAdd()
	{
		String result = "";
		String coid=getParam("co.coId");
		System.out.println(coid);
		System.out.println("课程号："+co.getCoId());
		try {
			String param = getParam("param");
			if(Integer.parseInt(param) == 1)
			{
				coService.addCourse(co);			
				result = doQuery();
				System.out.println("添加"+co.getC0Name());
			}
			else
				result = "addClass";
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}
public String doEdit() throws Exception{
		try {
			Integer param = Integer.parseInt(getParam("param"));
			if(param == 0){
				String cid = getParam("ccid");
				System.out.println(cid);
				co = (Course) coService.getCourse(Course.class, cid);
				return "editUser";
			}else if(param == 1){
				coService.modifyCourse(co);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doQuery();
	}
	public String doDelete() throws Exception{
		try {
			String cid = getParam("ccid");
			coService.deleteCourse(cid,Course.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doQuery();
	}
	
	protected String getParam(String key)
	{
		return ServletActionContext.getRequest().getParameter(key);
	}

	public Course getCo()
	{
		return co;
	}

	public void setCo(Course co)
	{
		this.co = co;
	}

	public courseService<Course> getCoService()
	{
		return coService;
	}

	public void setCoService(courseService<Course> coService)
	{
		this.coService = coService;
	}

	public List<Course> getCourse()
	{
		return course;
	}

	public void setCourse(List<Course> course)
	{
		this.course = course;
	}

	public String getSearchText()
	{
		return searchText;
	}

	public void setSearchText(String searchText)
	{
		this.searchText = searchText;
	}
	

}