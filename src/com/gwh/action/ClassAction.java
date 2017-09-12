package com.gwh.action;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.gwh.pojo.TbClass;
import com.gwh.service.classService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 用户管理控制器
 * */

public class ClassAction  extends ActionSupport {

	private static final long serialVersionUID = -281275682819237996L;
	
	private TbClass c = new TbClass(); 
	
	@SuppressWarnings("rawtypes")
	private classService<TbClass> ClassService;
	
	private List<TbClass> classes;
	
	private String searchText;
	
	public String doQuery() throws Exception{
		searchText = getParam("queryText");
		classes = ClassService.queryClasses(searchText,TbClass.class);
		return SUCCESS;
	}
	
	@SuppressWarnings("unchecked")
	public String doQuery2() throws Exception{
		System.out.println(1111);
		String cid=getParam("ccid");
		System.out.println(cid);
		c = ClassService.getClass(TbClass.class,cid);
		ServletActionContext.getRequest().setAttribute("classlist",c);
		System.out.println(c.getCName());
	    return SUCCESS;
	}
	
	public String doAdd()
	{
		String result = "";
		
		try {
			String param = getParam("param");
			if(Integer.parseInt(param) == 1){
				System.out.println("添加");
				ClassService.addClass(c);
				
				result = doQuery();
				System.out.println("添加"+c.getCName());
			}else
				result = "addClass";
		} catch (Exception e) {
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
				c = (TbClass) ClassService.getClass(TbClass.class, cid);
				return "editUser";
			}else if(param == 1){
				ClassService.modifyClass(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doQuery();
	}
	public String doDelete() throws Exception{
		try {
			String cid = getParam("ccid");
			ClassService.deleteClass(cid,TbClass.class);
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

	public TbClass getC()
	{
		return c;
	}

	public void setC(TbClass c)
	{
		this.c = c;
	}

	public classService<TbClass> getClassService()
	{
		return ClassService;
	}

	public void setClassService(classService<TbClass> classService)
	{
		ClassService = classService;
	}

	public List<TbClass> getClasses()
	{
		return classes;
	}

	public void setClasses(List<TbClass> classes)
	{
		this.classes = classes;
	}

	public void setSearchText(String searchText)
	{
		this.searchText = searchText;
	}

}