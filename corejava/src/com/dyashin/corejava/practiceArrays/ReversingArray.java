package com.dyashin.corejava.practiceArrays;

public class ReversingArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {3,7,2,1,6,5};
		int n=arr.length;
		for(int i=0;i<n/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[n-1-i];
			arr[n-1-i]=temp;
		}
		System.out.println("The reversed array is");
		for(int i=0;i<n;i++)
		{
		System.out.print(+arr[i]+" ");
		}
	}
}
