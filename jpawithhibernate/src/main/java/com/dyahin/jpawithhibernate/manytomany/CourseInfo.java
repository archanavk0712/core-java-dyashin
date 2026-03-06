package com.dyahin.jpawithhibernate.manytomany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="COURSEINFO")
public class CourseInfo {

	@Id
	private int cID;
	
	@Column
	private String cName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Courses_Student",
	joinColumns = @JoinColumn(name="cID"),
	inverseJoinColumns = @JoinColumn(name="sID"))
	private List <StudentInfo> studentInfo;
	
	public CourseInfo() {
		// TODO Auto-generated constructor stub
	}

	public int getcID() {
		return cID;
	}

	public void setcID(int cID) {
		this.cID = cID;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}
	
	
}
