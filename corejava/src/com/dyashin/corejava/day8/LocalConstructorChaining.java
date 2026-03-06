package com.dyashin.corejava.day8;

class Employee{
	String name;
	int empID;
	String dept;
		
	public Employee() {
		this("Archana");
		System.out.println("Child Employee class Default Constructor");
	}
	
	public Employee(String name) {
		this("Archana", 1234,"CSE");
		this.name = name;
		System.out.println("Child Employee class Parameterized Constructor with 1 parameter: "+name);
	}
	
	public Employee(String name, int empID) {
		this.name = name;
		this.empID = empID;
		System.out.println("Child Employee class Parameterized Constructor with 2 parameters: "+name+" and "+empID);
	}
	
	public Employee(String name, int empID, String dept) {
		this("Archana",1234);
		this.name = name;
		this.empID = empID;
		this.dept = dept;
		System.out.println("Child Employee class Parameterized Constructor with 3 parameters: "+name+", "+empID+", "+dept);
	}
	
}
public class LocalConstructorChaining 
{
	public static void main(String[] args) 
	{
		Employee e=new Employee();
	}
}
