package com.gwh.service;

import java.util.List;

import com.gwh.dao.classbase;
import com.gwh.pojo.TbClass;
import com.gwh.dao.base;
import com.gwh.pojo.Student;

/**
 * 用户管理业务逻辑的实现
 * */
public class classService<T> {
	
private classbase cbase;
private base sbase;
	
	public List<TbClass> queryClasses(String cid,Class<TbClass> clazz) throws Exception{
		if(cid == null || "".equals(cid))
			return cbase.getAllObjects(clazz);
		String queryString = "SELECT u FROM TbClass u WHERE u.CId like '"+cid+"%'";
		return cbase.getObjects(queryString);
	}
	
	public void addClass(T user) throws Exception{
		cbase.addObject(user);
	}
	
	public void modifyClass(T user) throws Exception{
		cbase.updateObject(user);
	}
	
	public void deleteClass(String cid,Class<T> clazz) throws Exception{
		//
		String delString="delete from Student where C_Id like'"+cid+"'";
		List<Student> S=sbase.getObjects(delString);
		sbase.deleteObject(S);
		//
		T C = cbase.getObject(clazz, cid);
		cbase.deleteObject(C);
	}
	
	public T getClass(Class<T> clazz, String cid){
		return cbase.getObject(clazz, cid);
	}

	public classbase getCbase()
	{
		return cbase;
	}

	public void setCbase(classbase cbase)
	{
		this.cbase = cbase;
	}
	
}
