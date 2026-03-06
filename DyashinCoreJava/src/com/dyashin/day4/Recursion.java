package com.dyashin.day4;

public class Recursion 
{
	public static int factorial(int n)
	{
		int fact=1;
		for (int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	public static int factorialRec(int n)
	{
		if(n==0)  //base case
		{
			return 1;
		}
		return n * factorialRec(n-1);  //recursive case
	}
	
	public static void main(String[] args) 
	{
		System.out.println(factorial(3));
		System.out.println(factorialRec(3));
	}
}
