package com.dyashin.corejava.practiceArrays;

public class ArrayLinearSearch 
{
	public static void main(String[] args) 
	{
		int arr[] = {12,21,32,43,25,56};
		int target=32;
		boolean element=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				element=true;
				System.out.println(target+" is found at index: "+i);
				break;
			}
		}
		if(!element)
		{
			System.out.println(target+" is not found");
		}
	}
}
