package com.dyashin.corejava.practiceArrays;

public class CountEvenOddElementsArray 
{
	public static void main(String[] args) 
	{
		int arr[] = {12,21,32,43,25,56};
		int evenCount=0;
		int oddCount=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println("The total no. of even numbers in {12,21,32,43,25,56} is: "+evenCount);
		System.out.println("The total no. of odd numbers in {12,21,32,43,25,56} is: "+oddCount);
	}

}
