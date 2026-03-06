package com.dyashin.corejava.day9;

class Bird {
	protected void sound() {
		System.out.println("Bird makes sound");
	}
}

class Crow extends Bird {
//	@Override
//	public void sound() {
//		System.out.println("Crow craws");
//	}
	
	public void drink() {
		System.out.println("Crow drinks water");
	}
}
public class ObjectTypeCasting {

	public static void main(String[] args) 
	{
		//Upcasting
		Bird b=new Crow();  //Creating object for sub class and referring it into super class
		b.sound();
		
		System.out.println("=========================================");
		
		//Downcasting
		Bird b1=new Crow();  //First need to upcast inorder to downcast 
		b1.sound();
		
		Crow c=(Crow) b1;  //downcasting
		c.drink();
		c.sound();
	}
}
