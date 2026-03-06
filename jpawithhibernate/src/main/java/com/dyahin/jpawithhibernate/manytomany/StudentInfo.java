package com.dyahin.jpawithhibernate.manytomany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="STUDENTINFO")
public class StudentInfo {

	@Id
	private int sID;
	
	@Column
	private String sName;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "studentInfo")
	private List <CourseInfo> courseInfo;
	
	public StudentInfo() {
		// TODO Auto-generated constructor stub
	}

	public int getsID() {
		return sID;
	}

	public void setsID(int sID) {
		this.sID = sID;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}
	
	
}
