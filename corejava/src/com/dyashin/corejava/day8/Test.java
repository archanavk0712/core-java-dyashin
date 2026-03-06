package com.dyashin.corejava.day8;

public class Test 
{
	public static void main(String[] args) 
	{
		Encapsulation2 a=new Encapsulation2(25000);
		System.out.println("The initial balance is:"+a.getBalance());
		a.deposit(2000);
		a.withdrawal(2000);
	}
}
