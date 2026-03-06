package com.dyashin.corejava.practicePatterns;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		int n=242, rev=0;
		int num=n;
		while(num!=0)
		{
			int dig=num%10;
			rev=rev*10+dig;
			num=num/10;
		}
		if (n==rev)
		{
			System.out.println(n+" is a palindrome");
		}
		else
			System.out.println(n+" is not a palindrome");
	}

}
