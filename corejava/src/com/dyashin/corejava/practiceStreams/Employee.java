package com.dyashin.corejava.practiceStreams;

public class Employee {

	private String name;
	private int id, exp, salary;

	public Employee(String name, int id, int exp, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.exp = exp;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getExp() {
		return exp;
	}

	public int getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
