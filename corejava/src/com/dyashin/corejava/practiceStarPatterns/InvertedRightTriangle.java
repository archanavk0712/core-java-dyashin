package com.dyashin.corejava.practiceStarPatterns;

public class InvertedRightTriangle 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

