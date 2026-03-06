package com.dyashin.corejava.day5;

public class NonStaticBlock 
{
	static{
		NonStaticBlock a=new NonStaticBlock();
	}
	{
		System.out.println("1st Non-static block");
	}
	{
		System.out.println("2nd Non-static block");
	}
	{
		System.out.println("3rd Non-static block");
	}
	
	public void method1()
	{
		System.out.println("Non-static block");
	}
	public static void main(String[] args) 
	{
		System.out.println("Mainmethod");
//		NonStaticBlock a=new NonStaticBlock();
//		a.method1();
	}
}
