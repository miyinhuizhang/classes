package com.gwh.service;

import java.util.List;

import com.gwh.dao.courseBase;
import com.gwh.pojo.Course;;

/**
 * 用户管理业务逻辑的实现
 * */
public class courseService<T> {
	
private courseBase cobase;
	
	public List<Course> queryCourses(String coId,Class<Course> clazz) throws Exception{
		if(coId == null || "".equals(coId))
			return cobase.getAllObjects(clazz);
		String queryString = "SELECT u FROM Course u";
		return cobase.getObjects(queryString);
	}
	
	public void addCourse(T user) throws Exception{
		cobase.addObject(user);
	}
	
	public void modifyCourse(T user) throws Exception{
		cobase.updateObject(user);
	}
	
	public void deleteCourse(String coId,Class<T> clazz) throws Exception{
		T C = cobase.getObject(clazz, coId);
		cobase.deleteObject(C);
	}
	
	public T getCourse(Class<T> clazz, String coId){
		return cobase.getObject(clazz, coId);
	}

	public courseBase getCobase()
	{
		return cobase;
	}

	public void setCobase(courseBase cobase)
	{
		this.cobase = cobase;
	}
	
	public Course get(String coId)
	{
		return cobase.get(coId);
	}
	
}

