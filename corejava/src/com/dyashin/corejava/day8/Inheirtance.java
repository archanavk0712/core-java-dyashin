package com.dyashin.corejava.day8;

class Vehicle{
	public Vehicle() {
		System.out.println("Inside the Vehicle super class");
	}
}

//Multilevel Inheritance
class Car extends Vehicle{
	public Car() {
		System.out.println("Inside the Car sub class");
	}
}

//Multilevel Inheritance
class ElectricCar extends Car{
	public ElectricCar() {
		System.out.println("Inside the ElectricCar subs-sub class");
		System.out.println("=======================");
	}
}

//Hierarchial Inheritance
class Bike extends Vehicle{
	public Bike(){
		System.out.println("Inside the Bike subclass");
	}
}

//Hierarchial Inheritance
class Truck extends Vehicle{
	public Truck(){
		System.out.println("Inside the Truck subclass");
		System.out.println("=======================");
	}
}
public class Inheirtance 
{
	public static void main(String[] args) 
	{
		ElectricCar e=new ElectricCar();
		Bike b=new Bike();
		Truck t=new Truck();
	}

}
