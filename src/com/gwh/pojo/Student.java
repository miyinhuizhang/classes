package com.gwh.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private String SId;
	private TbClass tbClass;
	private String SName;
	private String SSex;
	private String SBrithday;
	private String SPassword;
	private String STelphone;
	private String SAddress;
	private Set grades = new HashSet(0);

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(TbClass tbClass, String SName, String SSex,
			String SBrithday, String SPassword, String STelphone,
			String SAddress) {
		this.tbClass = tbClass;
		this.SName = SName;
		this.SSex = SSex;
		this.SBrithday = SBrithday;
		this.SPassword = SPassword;
		this.STelphone = STelphone;
		this.SAddress = SAddress;
	}

	/** full constructor */
	public Student(TbClass tbClass, String SName, String SSex,
			String SBrithday, String SPassword, String STelphone,
			String SAddress, Set grades) {
		this.tbClass = tbClass;
		this.SName = SName;
		this.SSex = SSex;
		this.SBrithday = SBrithday;
		this.SPassword = SPassword;
		this.STelphone = STelphone;
		this.SAddress = SAddress;
		this.grades = grades;
	}

	// Property accessors

	public String getSId() {
		return this.SId;
	}

	public void setSId(String SId) {
		this.SId = SId;
	}

	public TbClass getTbClass() {
		return this.tbClass;
	}

	public void setTbClass(TbClass tbClass) {
		this.tbClass = tbClass;
	}

	public String getSName() {
		return this.SName;
	}

	public void setSName(String SName) {
		this.SName = SName;
	}

	public String getSSex() {
		return this.SSex;
	}

	public void setSSex(String SSex) {
		this.SSex = SSex;
	}

	public String getSBrithday() {
		return this.SBrithday;
	}

	public void setSBrithday(String SBrithday) {
		this.SBrithday = SBrithday;
	}

	public String getSPassword() {
		return this.SPassword;
	}

	public void setSPassword(String SPassword) {
		this.SPassword = SPassword;
	}

	public String getSTelphone() {
		return this.STelphone;
	}

	public void setSTelphone(String STelphone) {
		this.STelphone = STelphone;
	}

	public String getSAddress() {
		return this.SAddress;
	}

	public void setSAddress(String SAddress) {
		this.SAddress = SAddress;
	}

	public Set getGrades() {
		return this.grades;
	}

	public void setGrades(Set grades) {
		this.grades = grades;
	}

}
