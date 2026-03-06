package com.dyashin.corejava.day2;

public class OperationsDecrement 
{
	public static void main(String[] args) 
	{
		int x=0;
		/*System.out.println("Before pre decrementing "+x);
		int y=--x;
		System.out.println("After pre decrementing "+x);
		System.out.println(y);*/
		
		System.out.println("Before post decrementing "+x);
		int a=x;
		System.out.println("After post decrementing "+x);
		System.out.println(a);
		
		int y=x++ + x-- + ++x;
		System.out.println(y);
		System.out.println(x);
	}

}

