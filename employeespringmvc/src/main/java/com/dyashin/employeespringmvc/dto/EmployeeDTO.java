package com.dyashin.employeespringmvc.dto;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "employee_info")
public class EmployeeDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
