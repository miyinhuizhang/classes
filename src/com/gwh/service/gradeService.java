package com.gwh.service;

import java.util.List;

import com.gwh.dao.gradeBase;
import com.gwh.pojo.Grade;
import com.gwh.pojo.GradeId;

/**
 * 用户管理业务逻辑的实现
 * */
public class gradeService<T> {
	
private gradeBase gbase;

	public Grade doQ(String sid,String cid) throws Exception{
		if(sid == null || cid == null) return null;
		String queryString = "select u from Grade u where u.S_ID = '"+sid +"' and u.C_ID = '"+cid+"'";

		System.out.println(queryString);
		//List<Grade> gs = gbase.getObjects(queryString);
		return (Grade) gbase.getObjects(queryString);
	}
	
	public List<Grade> queryGrades(String GradeId,Class<Grade> clazz) throws Exception{
		if(GradeId == null || "".equals(GradeId))
			return gbase.getAllObjects(clazz);
		String queryString = "SELECT u FROM Grade u WHERE u.id.student.SId = '"+GradeId+"'";
		return gbase.getObjects(queryString);
	}
	
	public List<Grade> kcqueryGrades(String kcId,Class<Grade> clazz) throws Exception{
		if(kcId == null || "".equals(kcId))
			return gbase.getAllObjects(clazz);
		System.out.println("select");
		String queryString = "SELECT u FROM Grade u WHERE u.id.course.coId = '"+kcId+"'";
		return gbase.getObjects(queryString);
	}
	
	public void addGrade(T user) throws Exception{
		gbase.addObject(user);
	}
	
	public void modifyGrade(T user) throws Exception{
		gbase.updateObject(user);
	}
	
	public void deleteGrade(GradeId GradeId,Class<T> clazz) throws Exception{
		System.out.println(33);
		T C = gbase.getObject(clazz, GradeId);
		System.out.println(44);
		gbase.deleteObject(C);
	}
	
	public T getGrade(Class<T> clazz, GradeId Id){
		return gbase.getObject(clazz, Id);
	}

	public gradeBase getGbase()
	{
		return gbase;
	}

	public void setGbase(gradeBase gbase)
	{
		this.gbase = gbase;
	}
	
	public Grade get(GradeId gradeid)
	{
		return gbase.get(gradeid);
		
	}
	
}
