package com.dyashin.corejava.day11;

class Laptop{
	String name;
	double price;
	public void details() {
		System.out.println("Method inside Laptop class");
	}
	
//	@Override
//	public int hashCode() {
//		return 1;
//	}
	
}
public class ObjectMethodHashCode {

	public static void main(String[] args) {
		Laptop laptop=new Laptop();
		System.out.println(laptop.hashCode());
		
	}

}
