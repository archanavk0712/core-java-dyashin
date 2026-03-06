package com.dyashin.employeespringmvc.request;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {
	
	private int id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String phoneNo;
	private int age;
    private String gender;
    private double salary;
    private Date dob;
    private Date joiningDate;
    private int departmentNo;
    private int experience;
    private String designation;
	

}
