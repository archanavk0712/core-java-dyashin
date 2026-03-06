package com.dyashin.corejava.practiceArrays;

public class SmallestArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,32,6,54,53,24};
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest) 
			{
				smallest=arr[i];
			}
		}
		System.out.println("The smallest element in {1,32,6,54,53,25} is: "+smallest);
	}

}

