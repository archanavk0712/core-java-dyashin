package com.dyahin.jpawithhibernate.onetomany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="BOX")
public class Box {

	@Id
	private int bID;
	
	@Column
	private String bName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "box")
	private List<Pencil> pencil;
	
	public Box() {
		// TODO Auto-generated constructor stub
	}

	public int getbID() {
		return bID;
	}

	public List<Pencil> getPencil() {
		return pencil;
	}

	public void setPencil(List<Pencil> pencil) {
		this.pencil = pencil;
	}

	public void setbID(int bID) {
		this.bID = bID;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}
	
}

