package com.dyashin.corejava.day5;

public class Static 
{
	int age=20;
	static String name="abc";
	
	static void department()
	{
		name="pqr";
//		age=29;             Cannot access a Non-static member in a static method
		System.out.println(""+name);
		System.out.println("cs");
	}
	
	public void classes()
	{
		name="lmn";
		int age=20;       //But can access a static member in a Non-static method
		System.out.println(""+name);
		System.out.println(""+age);
	}

	public static void main(String[] args) 
	{
		Static a=new Static();
		a.classes();
		System.out.println(name);
		department();
	}
}
