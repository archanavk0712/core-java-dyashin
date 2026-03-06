package com.dyashin.corejava.day6;

public class Variables 
{
	int age;	//Default value will be printed if not initialized according to its datatype, in this case 0 for int
	String name;	//Default value null for string datatype
	static int group;
	
	public void doStuff() 
	{
		int a=1;	//local variable and it must and shld be initilaized
		for(;a<=10;a++)
		{
			System.out.println("Inside the method "+a);
		}
	}
	
	static void doStuff2()
	{
		int b=3;
		for(;b<=10;b++)
		{
			System.out.println("Inside the method "+b);
		}
	}
	
	public void doStuff3(int a, int b) 
	{
		int c=a+b;
		System.out.println("Addition of "+a+" "+b+" is "+c);
	}
	
	public static void main(String[] args) 
	{
		Variables v=new Variables();
		System.out.println(v.age);
		System.out.println(v.name);
		v.doStuff();
		v.doStuff3(4,6);
		System.out.println(group);
		Variables.doStuff2();
	}

}
