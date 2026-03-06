package com.dyahin.jpawithhibernate.manytomanypractice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {
	
	@Id
	private int bid;
	
	private String bname;
	
	
}
