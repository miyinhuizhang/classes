package com.gwh.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.gwh.pojo.Student;



public class base extends HibernateDaoSupport {
	
	/**查询*/
	@SuppressWarnings("unchecked")
	public List<Student> getObjects(String queryString) throws Exception{
		return (List<Student>)this.getHibernateTemplate().find(queryString);
	}
	
	/**查询所有*/
	public List<Student> getAllObjects(Class<Student> clazz){
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
	
	/**通过SID获取*/
	public <T> T getObject(Class<T> clazz,Serializable SID){
		return this.getHibernateTemplate().get(clazz, SID);
	}
	public Student get(String id)
	{
		return getHibernateTemplate().get(Student.class, id);
	}
}

