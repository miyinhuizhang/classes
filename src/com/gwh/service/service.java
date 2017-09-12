package com.gwh.service;

import java.util.List;

import com.gwh.dao.base;
import com.gwh.pojo.Student;

/**
 * 用户管理业务逻辑的实现
 * */
public class service<T> {
	
private base dao;
	
	public Student doLogin(String sid,String password) throws Exception{
		if(sid == null || password == null) return null;
		String queryString = "select u from Student u where u.SId = '"+sid +"' and u.SPassword = '"+password+"'";

		System.out.println(queryString);
		List<Student> users = dao.getObjects(queryString);
		return users.get(0);
	}
	
	public List<Student> queryUsers(String sid,Class<Student> clazz) throws Exception{
		if(sid == null || "".equals(sid))
			return dao.getAllObjects(clazz);
		String queryString = "SELECT u FROM Student u WHERE u.S_ID like '"+sid+"%'";
		return dao.getObjects(queryString);
	}
	
	public void addUser(T user) throws Exception{
		dao.addObject(user);
	}
	
	public void modifyUser(T user) throws Exception{
		dao.updateObject(user);
	}
	
	public void deleteUser(String sid,Class<T> clazz) throws Exception{
		T u = dao.getObject(clazz, sid);
		dao.deleteObject(u);
	}
	
	public T getUser(Class<T> clazz, String sid){
		return dao.getObject(clazz, sid);
	}
	
	public base getDao() {
		return dao;
	}

	public void setDao(base dao) {
		this.dao = dao;
	}
	public Student get(String SId)
	{
		return dao.get(SId);
	}
}
