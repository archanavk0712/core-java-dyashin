package com.dyashin.corejava.day4;

class Car
{
	public String name;
	public void engine()
	{
		System.out.println("Car engine");
	}
}

public class Classes 
{
	public int a=5;
	public static void main(String[] args) 
	{
		Car c=new Car();
		c.name="Audi";
		System.out.println(c.name);
		c.engine();
	}
}
