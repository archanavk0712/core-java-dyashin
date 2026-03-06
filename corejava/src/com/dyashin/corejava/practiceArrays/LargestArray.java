package com.dyashin.corejava.practiceArrays;

public class LargestArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,32,6,54,53,24};
		int largest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest) 
			{
				largest=arr[i];
			}
		}
		System.out.println("The largest element in {1,32,6,54,53,25} is: "+largest);
	}

}
