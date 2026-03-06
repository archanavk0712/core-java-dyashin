package com.dyahin.jpawithhibernate.manytomanypractice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Person {

	@Id
	private int pid;
	
	private String pname;
	
}
