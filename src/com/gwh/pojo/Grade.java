package com.gwh.pojo;

/**
 * Grade entity. @author MyEclipse Persistence Tools
 */

public class Grade implements java.io.Serializable {

	// Fields

	private GradeId id;
	private Double GGrade;

	// Constructors

	/** default constructor */
	public Grade() {
	}

	/** full constructor */
	public Grade(GradeId id, Double GGrade) {
		this.id = id;
		this.GGrade = GGrade;
	}

	// Property accessors

	public GradeId getId() {
		return this.id;
	}

	public void setId(GradeId id) {
		this.id = id;
	}

	public Double getGGrade() {
		return this.GGrade;
	}

	public void setGGrade(Double GGrade) {
		this.GGrade = GGrade;
	}

}
