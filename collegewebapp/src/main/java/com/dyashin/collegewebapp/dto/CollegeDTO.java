package com.dyashin.collegewebapp.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Version;
import lombok.Data;

@Data
@Entity
@NamedQuery(name = "CollegeDTO.findByUniversity", query = "select c from CollegeDTO c where c.university=:uni")
public class CollegeDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false, length = 100)
	private String name;

	private String dept;

	private String location;

	private String university;

	private double fee;
	
	@Version
	private int version;
}
