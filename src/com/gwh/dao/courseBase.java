package com.gwh.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.gwh.pojo.Course;

public class courseBase extends HibernateDaoSupport {
	
	/**查询*/
	@SuppressWarnings("unchecked")
	public List<Course> getObjects(String queryString) throws Exception{
		return (List<Course>)this.getHibernateTemplate().find(queryString);
	}
	
	/**查询所有*/
	public List<Course> getAllObjects(Class<Course> clazz){
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
		this.getHibernateTemplate().delete(clazz);
	}
	
	/**通过CoID获取*/
	public <T> T getObject(Class<T> clazz,Serializable CoID){
		return this.getHibernateTemplate().get(clazz, CoID);
	}
	public Course get(String id)
	{
		return getHibernateTemplate().get(Course.class, id);
	}
}