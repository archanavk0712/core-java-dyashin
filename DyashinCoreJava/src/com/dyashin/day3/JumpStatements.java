package com.dyashin.day3;

public class JumpStatements 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=15;i++)
		{
			if(i==10)
			{
//				break;
				continue;
			}
			System.out.println(i);
		}
	}
}
