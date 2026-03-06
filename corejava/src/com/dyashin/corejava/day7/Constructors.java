package com.dyashin.corejava.day7;

public class Constructors {
	int empID;
	String name;

	public Constructors() {
		System.out.println("Default Constructors");
	}

	public Constructors(int ID) {
		empID = ID;
	}
	
	private Constructors(int ID, String Fname) {
		empID = ID;
		name = Fname;
	}

	public void display() {
		System.out.println("empID: " + empID + " Name: " + name);
	}

	public static void main(String[] args) {
		
		Constructors a = new Constructors();
		a.display();

		Constructors b = new Constructors(22);
		b.display();

		Constructors c = new Constructors(1, "abc");
		c.display();
	}
}
