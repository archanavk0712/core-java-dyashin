package com.dyahin.jpawithhibernate.onetomany;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="PENCIL")
public class Pencil {

	@Id
	private int pID;
	
	@Column
	private String pName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="bId")
	private Box box;
	
	public Pencil() {
		// TODO Auto-generated constructor stub
	}

	public int getpID() {
		return pID;
	}

	public void setpID(int pID) {
		this.pID = pID;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Box getBox() {
		return box;
	}

	public void setBox(Box box) {
		this.box = box;
	}

	
}
