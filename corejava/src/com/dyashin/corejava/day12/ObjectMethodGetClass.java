package com.dyashin.corejava.day12;

class Laptop2{
	String name;
	double price;
	
	public Laptop2(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void details() {
		System.out.println("Method inside Laptop class");
	}
	
}

public class ObjectMethodGetClass {

	public static void main(String[] args) {

		Laptop2 l=new Laptop2("HP",2000);
		Laptop2 l1=new Laptop2("Dell",2030);
		System.out.println(l.getClass());
	}
}
