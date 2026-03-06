package com.dyashin.jpawithhibernate.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="DEPARTMENT")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	//autogenerate values
	@Column(name="DEPT_NO")
	private int deptNo;
	
	@Column(name="DEPT_NAME" )
	private String dName;
	
	@Column(name="LOCATION")
	private String loc;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
}
