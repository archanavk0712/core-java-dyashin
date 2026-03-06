package com.dyashin.corejava.day8;

class Parent {
	public Parent() {
		System.out.println("Inside the parent class");
	}
}
class Child extends Parent{
	public Child() {
		System.out.println("Inside the Child class");
	}
	public Child(int a, int b) {
		super();
		System.out.println("Inside the child class. The parameters are "+a+" "+b);
	}
}
class SubChild extends Child{

	public SubChild() {
		super(2,3);
		System.out.println("Inside the subChild class");
	}
}
public class ConstructorChaining 
{
	public static void main(String[] args) 
	{
		SubChild a=new SubChild();
	}

}
