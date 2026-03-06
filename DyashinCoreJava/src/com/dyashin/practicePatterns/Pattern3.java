package com.dyashin.practicePatterns;

public class Pattern3 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=n-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(" ");
				System.out.print(k);
			}
			System.out.println();
		}
	}
}