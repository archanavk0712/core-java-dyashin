package com.dyashin.corejava.day7;

public class MaxArray 
{
	public static void main(String[] args) 
	{
		int arr[] = {12,21,32,43,25,56};
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for(int element:arr)
		{
			if(element>largest)
			{
				secondLargest=largest;
				largest=element;
			}
			else if(element>secondLargest && element!=largest)
			{
				secondLargest=element;
			}
		}
		System.out.println("The second largest element in the array is "+secondLargest);	
	}               
}
