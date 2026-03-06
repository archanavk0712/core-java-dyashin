package com.dyashin.corejava.day12;

class Laptop{
	String name;
	double price;
	
	public Laptop(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void details() {
		System.out.println("Method inside Laptop class");
	}
	
	@Override
	public String toString() {
		return "Laptop name: "+name+" price: "+price;
	}
	
	public String name() {
		return "Laptop name: "+name+" price: "+price;
	}
	
}
public class ObjectMethodToString {

	public static void main(String[] args) {

		Laptop laptop=new Laptop("HP",2000);
		Laptop laptop1=new Laptop("Dell",2030);
		System.out.println(laptop.toString());
		System.out.println(laptop1.toString());
		System.out.println(laptop1.name());
	}
}
