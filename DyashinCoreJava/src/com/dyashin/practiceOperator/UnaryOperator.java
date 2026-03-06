package com.dyashin.practiceOperator;

public class UnaryOperator 
{
	public static void main(String[] args) 
	{
		//Increment
		int x=3;
		int y= ++x + x++ + x++;
		System.out.println(x);
		System.out.println(y);
		
		//Decrement
		int a=3;
		int b= a-- + --a + a--;
		System.out.println(a);
		System.out.println(b);	
	}
}
