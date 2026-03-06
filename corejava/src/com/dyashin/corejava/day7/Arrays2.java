package com.dyashin.corejava.day7;

public class Arrays2 
{
	public static void main(String[] args) 
	{
		String arr[]=new String[100];
		arr[0]= "abc";
		arr[1]="pqr";
		arr[2]="lmn";
		
		for(int a=0;a<arr.length;a++ )
		{
			System.out.println("Index "+a+ "- Value "+arr[a]);
		}
	}
}
