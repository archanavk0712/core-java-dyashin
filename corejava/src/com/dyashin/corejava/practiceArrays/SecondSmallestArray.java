package com.dyashin.corejava.practiceArrays;

public class SecondSmallestArray 
{
	public static void main(String[] args) 
	{
		int arr[] = {12,21,32,43,25,56};
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		
		for(int element:arr)
		{
			if(element<smallest)
			{
				secondSmallest=smallest;
				smallest=element;
			}
			else if(element<secondSmallest && element!=smallest)
			{
				secondSmallest=element;
			}
		}
		System.out.println("The second largest element in {12,21,32,43,25,56} is: "+secondSmallest);
	}
}
