package com.dyashin.corejava.day4;

class Fact
{
	public int factorial(int n)
	{
		int fact=1;
		for (int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	public int factorialRec(int n)
	{
		if(n==0)  //base case
		{
			return 1;
		}
		return n * factorialRec(n-1);  //recursive case
	}
}
	
public class Objects 
{
	public static void main(String[] args) 
	{				
		Fact f=new Fact();
		System.out.println(f.factorial(6));
		System.out.println(f.factorialRec(4));
	}
}

