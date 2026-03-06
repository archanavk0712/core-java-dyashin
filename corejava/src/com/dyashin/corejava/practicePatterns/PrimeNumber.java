package com.dyashin.corejava.practicePatterns;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int n=7;
		boolean Prime=true;
		if (n==1) 
		{
			Prime=false;
		}
		else
		{
			for (int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					Prime=false;
				}
			}
		}
		if(Prime==true)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
	}
}
