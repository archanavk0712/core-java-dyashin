package com.dyashin.corejava.practice;

class Animal{
	public void name() {
		System.out.println("Inside animal class");
	}
}

class Dog extends Animal{
	public void na() {
		System.out.println("Inside Dog class");
	}
}

class Cat extends Animal{
	public void na() {
		System.out.println("Inside Cat class");
	}
}
public class oops {
	public static void main(String[] args) {
//		Cat cat=new Cat ();
//		cat.na();
//		cat.name();
		
		Animal a=new Dog();
		a.name();
	}
}
