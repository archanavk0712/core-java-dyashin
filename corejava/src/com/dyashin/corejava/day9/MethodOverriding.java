package com.dyashin.corejava.day9;

class Animal {
	protected void sound() {
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("Dog barks");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		Animal a = new Animal();
		a.sound();
	}
}
