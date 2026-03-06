package com.dyashin.corejava.day10;

abstract class Person{
//	abstract int a;     Cannot make Variables abstract
	public void behave() {
		System.out.println("she is a good person");
	}
	
	public void work() {
		System.out.println("Work for an IT firm");
	}
	
	public Person() {
		System.out.println("Deafult constructor of Person class");
	}

//	public abstract Person() {     Constructor cannot be made abstract 
//		super();
//	}

	public abstract void nativePlace();
	
}

abstract class Ram extends Person{

	public abstract void eat();
	
	public Ram() {
		System.out.println("Deafult constructor of Ram class");
	}
}

class Seetha extends Ram{

	@Override
	public void eat() {
		System.out.println("Seetha eats food");
	}

	@Override
	public void nativePlace() {
		System.out.println("Seetha's native is Bangalore");
	}
	
	public Seetha() {
		System.out.println("Deafult constructor of Seetha class");
	}
	
}
public class AbstractKeyword 
{
	public static void main(String[] args) 
	{
	//	Person p=new Person();      Cannot create instance of the abstract class
	//	Ram r=new Ram();            Cannot create instance of the abstract class
		Seetha s=new Seetha();
		s.eat();
		s.nativePlace();
		s.behave();
		s.work();
	}
}
