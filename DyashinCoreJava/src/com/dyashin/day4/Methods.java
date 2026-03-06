package com.dyashin.day4;

public class Methods 
{
	public static void add(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	public static int add1(int a, int b)
	{
		int sum=a+b;
		return sum;
	}
	
	public static void main(String[] args) 
	{
		add(2,3);
		System.out.println(add1(3,5));
	}
}
