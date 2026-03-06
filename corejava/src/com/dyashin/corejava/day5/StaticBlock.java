package com.dyashin.corejava.day5;

public class StaticBlock 
{
	String name="archana";
	static int age;
	
	static 
	{
//		name="abc";     Cannot access a non-static member in a static block
		age=35;
		System.out.println("1st block"+age);
	}
	static 
	{
		System.out.println("2nd block");
	}
	static 
	{
		
		System.out.println("3rd block");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Mainmethod");
		StaticBlock a=new StaticBlock();
	}
}
