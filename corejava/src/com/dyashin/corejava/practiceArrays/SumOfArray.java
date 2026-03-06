package com.dyashin.corejava.practiceArrays;

public class SumOfArray
{
	public static void main(String[] args) 
	{
		int arr[]= {2,64,23,65,87};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("The sum of {2,64,23,65,87} is: "+sum);
	}
}

