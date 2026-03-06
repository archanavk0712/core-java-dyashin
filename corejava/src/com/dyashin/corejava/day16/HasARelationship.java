package com.dyashin.corejava.day16;

class Car {
	private Engine engine;

	public Car() {
		engine = new Engine();
	}

	void drive() {
		engine.start();
		System.out.println("Car is moving....");
	}
}

class Engine {
	public void start() {
		System.out.println("Engine has started");
	}
}

public class HasARelationship {

	public static void main(String[] args) {
		
		Car c=new Car();
		c.drive();
	
	}

}
