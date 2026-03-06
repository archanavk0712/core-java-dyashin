package com.dyashin.corejava.day2;

public class OperationsBitwise 
{
	public static void main(String[] args) 
	{
		int x=5, y=3;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		int z = x & y;
		System.out.println(Integer.toBinaryString(z));
		System.out.println(z);
		int a = x | y;
		int b = x ^ y;
		int c = ~x;
		int d = x << 1;
		int e = x >>1;
		System.out.println("Value is "+a+" ,value in binary "+Integer.toBinaryString(a));
		System.out.println("Value is "+b+", value in binary "+Integer.toBinaryString(b));
		System.out.println("Value is "+c+" ,value in binary "+Integer.toBinaryString(c));
		System.out.println("Value is "+d+" ,value in binary "+Integer.toBinaryString(d));
		System.out.println("Value is "+e+" ,value in binary "+Integer.toBinaryString(e));
	}
}
