package com.gwh.action;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.gwh.pojo.Course;
import com.gwh.pojo.Grade;
import com.gwh.pojo.GradeId;
import com.gwh.pojo.Student;
import com.gwh.pojo.TbClass;
import com.gwh.service.classService;
import com.gwh.service.courseService;
import com.gwh.service.gradeService;
import com.gwh.service.service;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 用户管理控制器
 * */

public class GradeAction  extends ActionSupport {

	private static final long serialVersionUID = -281275682819237996L;
	
	private Grade g = new Grade(); 
	private GradeId gid;
	
	@SuppressWarnings("rawtypes")
	private gradeService<Grade> gService;
	
	private List<Grade> grade;
	
	private String searchText;
	private service<Student> StudentService;
	private courseService<Course> coService;
	private double max;
	private double min;
	private double pro;
	
	public String doQuery() throws Exception{
		searchText = getParam("queryText");
		grade = gService.queryGrades(searchText,Grade.class);
		return SUCCESS;
	}
	
	@SuppressWarnings("unchecked")
	public String doQuery2() throws Exception{
		String gsid = getParam("gsid");
		System.out.println(gsid);
		String gcid = getParam("gcid");
		System.out.println(gcid);
		gid=new GradeId(StudentService.get(gsid),coService.get(gcid));
		g = gService.get(gid);
		System.out.println("查询成功");
	    return SUCCESS;
	}
	
	public String doQuery3() throws Exception{
		System.out.println("统计查询");
		String kecheng = getParam("kecheng");
		System.out.println(kecheng);
		grade = gService.kcqueryGrades(kecheng,Grade.class);
		System.out.println("查课程");
		int i;
		max=grade.get(0).getGGrade();
		min=grade.get(0).getGGrade();
		pro=grade.get(0).getGGrade();
		
		for(i=1;i<grade.size();i++)
		{
			if(max<grade.get(i).getGGrade())
				max=grade.get(i).getGGrade();
		}
		
		for(i=1;i<grade.size();i++)
		{
			if(min>grade.get(i).getGGrade())
				min=grade.get(i).getGGrade();
		}
		
		for(i=1;i<grade.size();i++)
		{
			pro=pro+grade.get(i).getGGrade();
		}
		
		pro=pro/grade.size();
		ActionContext context=ActionContext.getContext();
		context.put("max",max);
		context.put("min",min);
		context.put("pro",pro);
		System.out.println("查询成功"+grade.size()+"*"+max+"*"+min+"*"+pro);
	    return SUCCESS;
	}
	
	public String doQuery4() throws Exception{
		System.out.println("学生统计查询");
		String kecheng = getParam("kecheng");
		System.out.println(kecheng);
		grade = gService.queryGrades(kecheng,Grade.class);
		System.out.println("查学生成绩成功"+grade.size());
	    return SUCCESS;
	}
	
	public String doAdd()
	{
		String result = "";
		
		try {
			String param = getParam("param");
			if(Integer.parseInt(param) == 1){
				System.out.println("添加");
				gService.addGrade(g);			
				result = doQuery();
				System.out.println("添加"+g.getId()+g.getClass());
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
				String gsid = getParam("gsid");
				String gcid = getParam("gcid");
				gid=new GradeId(StudentService.get(gsid),coService.get(gcid));
				System.out.println(gsid);
				g = gService.get(gid);
				return "editUser";
			}else if(param == 1){
				gService.modifyGrade(g);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doQuery();
	}
	public String doDelete() throws Exception{
		try {
			System.out.println(00);
			String gsid = getParam("gsid");
			System.out.println(gsid);
			String gcid = getParam("gcid");
			System.out.println(gcid);
			System.out.println(11);
			gid=new GradeId(StudentService.get(gsid),coService.get(gcid));
			System.out.println(22);
			gService.deleteGrade(gid,Grade.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doQuery();
	}
	
	protected String getParam(String key)
	{
		return ServletActionContext.getRequest().getParameter(key);
	}

	public Grade getG()
	{
		return g;
	}

	public void setG(Grade g)
	{
		this.g = g;
	}


	public gradeService<Grade> getgService()
	{
		return gService;
	}

	public void setgService(gradeService<Grade> gService)
	{
		this.gService = gService;
	}

	public List<Grade> getGrade()
	{
		return grade;
	}

	public void setGrade(List<Grade> grade)
	{
		this.grade = grade;
	}

	public String getSearchText()
	{
		return searchText;
	}

	public void setSearchText(String searchText)
	{
		this.searchText = searchText;
	}

	public GradeId getGid() {
		return gid;
	}

	public void setGid(GradeId gid) {
		this.gid = gid;
	}

	public service<Student> getStudentService() {
		return StudentService;
	}

	public void setStudentService(service<Student> studentService) {
		StudentService = studentService;
	}

	public courseService<Course> getCoService() {
		return coService;
	}

	public void setCoService(courseService<Course> coService) {
		this.coService = coService;
	}
	

}
