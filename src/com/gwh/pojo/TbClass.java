package com.gwh.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * TbClass entity. @author MyEclipse Persistence Tools
 */

public class TbClass implements java.io.Serializable {

	// Fields

	private String CId;
	private String CName;
	private Set students = new HashSet(0);

	// Constructors

	/** default constructor */
	public TbClass() {
	}

	/** minimal constructor */
	public TbClass(String CName) {
		this.CName = CName;
	}

	/** full constructor */
	public TbClass(String CName, Set students) {
		this.CName = CName;
		this.students = students;
	}

	// Property accessors

	public String getCId() {
		return this.CId;
	}

	public void setCId(String CId) {
		this.CId = CId;
	}

	public String getCName() {
		return this.CName;
	}

	public void setCName(String CName) {
		this.CName = CName;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

}
