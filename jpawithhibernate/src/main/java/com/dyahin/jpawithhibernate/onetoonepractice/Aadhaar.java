package com.dyahin.jpawithhibernate.onetoonepractice;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Aadhaar {
	
	@Id
	private int aadhaarId;
	
	private String aadhaarLocation;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "aadhaar")
	private Citizen citizen;
}

