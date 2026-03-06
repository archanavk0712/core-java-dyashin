package com.dyashin.studentmanagementsystem.dto;

public class StudentDTO {

	private int id;

	private String name;

	private String standard;
	
	private int percentage;

	public StudentDTO(int id, String name, String standard, int percentage) {
		super();
		this.id = id;
		this.name = name;
		this.standard = standard;
		this.percentage=percentage;
	}

	public StudentDTO() {
	}

	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", standard=" + standard +", percentage=" + percentage + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getStandard() {
		return standard;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
	

}
