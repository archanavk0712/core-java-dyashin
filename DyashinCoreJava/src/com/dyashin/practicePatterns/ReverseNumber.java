package com.dyashin.practicePatterns;

public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		int n=342;
		int num=n;
		int rev=0;
		while(num!=0)
		{
			int dig=num%10;
			rev=rev*10+dig;
			num=num/10;
		}
		System.out.println(n+" when reversed , we get "+rev);
	}

}
