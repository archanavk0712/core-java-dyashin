package com.dyashin.corejava.day10;

public interface InterfaceExample {
	
	public void eat();
	
	public void sound();
}

class Tiger implements InterfaceExample{
	
	public Tiger() {
		System.out.println("Default constructor of Lion class");
	}

	@Override
	public void eat() {
		System.out.println("Lion eats meat");
	}

	@Override
	public void sound() {
		System.out.println("Lion roars");
	}
	
}
