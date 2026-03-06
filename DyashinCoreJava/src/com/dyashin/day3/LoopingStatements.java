package com.dyashin.day3;

public class LoopingStatements 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		System.out.println("-------------------------");
		
		for(int i=10; i>=0; i--)
		{
			System.out.println(i);
		}
		System.out.println("-------------------------");
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		} 
		

//		int l=10;
//		while(l==10)
//		{
//			System.out.println("l=10");
//		}
//		
//		
//		do
//		{
//			System.out.println("l=10");
//		}while(p==10);
	}
}
