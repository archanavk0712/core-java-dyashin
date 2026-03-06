package com.dyashin.corejava.day8;

public class Encapsulation 
{
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String nm) 
	{
		if(nm==null)
		{
			System.out.println("Invalid name");
		}
		else
		{
			name=nm;
		}
	}
	public void display()
	{
		System.out.println("Welcome to world of java");
	}
	public static void main(String[] args) 
	{
		Encapsulation a=new Encapsulation();
//		a.name="Archana";
//		System.out.println("Name:"+a.name);
//		a.display();
		
		a.setName("Arc");
		System.out.println(a.getName()); 
	}
}
