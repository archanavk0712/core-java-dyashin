package com.dyashin.corejava.practiceOperator;

public class BitWiseOperator
{
	public static void main(String[] args) 
	{
		int x=10, y=13;
		System.out.println("Binaruy value of "+x+" is "+Integer.toBinaryString(x));
		System.out.println("Binaruy value of "+y+" is "+Integer.toBinaryString(y));
		
		int l = x & y;
		int m = x | y;
		int n = x ^ y;
		int o = ~x;
		int p = x << 2;
		int q = x >>2;
		System.out.println("For &, Value is "+l+" ,value in binary "+Integer.toBinaryString(l));
		System.out.println("For |, Value is "+m+", value in binary "+Integer.toBinaryString(m));
		System.out.println("For ^, Value is "+n+" ,value in binary "+Integer.toBinaryString(n));
		System.out.println("For ~, Value is "+o+" ,value in binary "+Integer.toBinaryString(o));
		System.out.println("For <<, Value is "+p+" ,value in binary "+Integer.toBinaryString(p));
		System.out.println("For >>, Value is "+q+" ,value in binary "+Integer.toBinaryString(q));
	}
}
