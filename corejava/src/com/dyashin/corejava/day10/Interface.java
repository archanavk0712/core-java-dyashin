package com.dyashin.corejava.day10;

interface Animals{
	
	int a=1;
	public void eat();
	
	public void sound();
}

class Lion implements Animals{
	
	public Lion() {
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
public class Interface {

	public static void main(String[] args) {

//		Lion l=new Lion();
//		l.eat();
//		l.sound();
//		int b=Animals.a;
//		System.out.println(b);
		
		Animals a=new Lion();
		a.eat();
		a.sound();
	
	}
}
