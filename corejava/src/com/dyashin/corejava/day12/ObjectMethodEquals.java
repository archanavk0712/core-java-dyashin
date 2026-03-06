package com.dyashin.corejava.day12;

class Laptop1{
	String name;
	double price;
	
	public Laptop1(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void details() {
		System.out.println("Method inside Laptop class");
	}
	
	@Override
	public boolean equals(Object obj) {
			return false;
	}
	
}

public class ObjectMethodEquals {

	public static void main(String[] args) {

		Laptop1 l=new Laptop1("HP",2000);
		Laptop1 l1=new Laptop1("Dell",2030);
		Laptop1 l2=l;
		System.out.println(l.equals(l2));
	}

}
