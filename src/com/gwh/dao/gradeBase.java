package com.gwh.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.gwh.pojo.Grade;
import com.gwh.pojo.GradeId;

public class gradeBase extends HibernateDaoSupport {
	
	/**查询*/
	@SuppressWarnings("unchecked")
	public List<Grade> getObjects(String queryString) throws Exception{
		System.out.println("select2");
		return (List<Grade>)this.getHibernateTemplate().find(queryString);
	}
	
	/**查询所有*/
	public List<Grade> getAllObjects(Class<Grade> clazz){
		return this.getHibernateTemplate().loadAll(clazz);
	}
	
	/**添加一个*/
	public <T> void addObject(T clazz){
		this.getHibernateTemplate().save(clazz);
	}
	
	/**更新指定的*/
	public <T> void updateObject(T clazz){
		this.getHibernateTemplate().update(clazz);
	}

	/**删除指定的*/
	public <T> void deleteObject(T clazz){
		System.out.println(55);
		this.getHibernateTemplate().delete(clazz);
	}
	
	/**通过GradeId获取*/
	public <T> T getObject(Class<T> clazz,Serializable GradeId){
		return this.getHibernateTemplate().get(clazz, GradeId);
	}
	public Grade get(GradeId gradeid) 
	{
		return getHibernateTemplate().get(Grade.class, gradeid);
	}
}