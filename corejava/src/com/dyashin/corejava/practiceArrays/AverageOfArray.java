package com.dyashin.corejava.practiceArrays;

public class AverageOfArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {2,64,23,65,87};
		int sum=0;
		int n=arr.length;
		int avg;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		avg=sum/n;
		System.out.println("The average of {2,64,23,65,87} is: "+avg);
	}
}
