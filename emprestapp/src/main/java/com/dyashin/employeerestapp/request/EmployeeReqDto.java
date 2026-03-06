package com.dyashin.employeerestapp.request;


import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Getter;
import lombok.Setter;




@Getter

@Setter
@JsonRootName("employee")
public class EmployeeReqDto {

	private int id;

	private String fname;

	private String lastName;

	private String email;

	private String phoneNumber;

	private int age;

	private LocalDate dob;

	private String gender;

	private LocalDate joiningDate;

	private int deptNumber;

	private String designation;

	private int experience;

	private double salary;

}