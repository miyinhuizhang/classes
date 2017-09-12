package com.gwh.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Course entity. @author MyEclipse Persistence Tools
 */

public class Course implements java.io.Serializable {

	// Fields

	private String coId;
	private String c0Name;
	private String coNature;
	private Double coCredit;
	private Set grades = new HashSet(0);

	// Constructors

	/** default constructor */
	public Course() {
	}

	/** minimal constructor */
	public Course(String c0Name, String coNature, Double coCredit) {
		this.c0Name = c0Name;
		this.coNature = coNature;
		this.coCredit = coCredit;
	}

	/** full constructor */
	public Course(String c0Name, String coNature, Double coCredit, Set grades) {
		this.c0Name = c0Name;
		this.coNature = coNature;
		this.coCredit = coCredit;
		this.grades = grades;
	}

	// Property accessors

	public String getCoId() {
		return this.coId;
	}

	public void setCoId(String coId) {
		this.coId = coId;
	}

	public String getC0Name() {
		return this.c0Name;
	}

	public void setC0Name(String c0Name) {
		this.c0Name = c0Name;
	}

	public String getCoNature() {
		return this.coNature;
	}

	public void setCoNature(String coNature) {
		this.coNature = coNature;
	}

	public Double getCoCredit() {
		return this.coCredit;
	}

	public void setCoCredit(Double coCredit) {
		this.coCredit = coCredit;
	}

	public Set getGrades() {
		return this.grades;
	}

	public void setGrades(Set grades) {
		this.grades = grades;
	}

}
