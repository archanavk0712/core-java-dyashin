package com.dyahin.jpawithhibernate.onetoonepractice;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Citizen {

	@Id
	private int citizenId;
	
	private String citizenOccupation;
	
	private String citizenPAN;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="aadhaarId")
	private Aadhaar aadhaar;
}
