package com.dyashin.corejava.day2;

public class OperationsIncrement 
{
	public static void main(String[] args) 
	{
		int x=2;
		/*System.out.println("Before pre incrementing "+x);
		int y=++x;
		System.out.println("After pre incrementing "+x);
		System.out.println(y);*/
		
		System.out.println("Before post incrementing "+x);
		int a=x++;
		System.out.println("After post incrementing "+x);
		System.out.println(a);
		}
}
