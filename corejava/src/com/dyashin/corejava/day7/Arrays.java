package com.dyashin.corejava.day7;

public class Arrays 
{
	public static void main(String[] args) 
	{
		int empID[] = {12,21,32,43,25,56};
		int [] empIDs = {1,2,3,4,5,6};
//		int emp[]=new int[10];
		float marks[]=new float[3];
		marks[0]=3.23f;
		marks[1]=5.23f;
		marks[2]=7.23f;
		
		for(int i=0;i<empIDs.length;i++)
		{
			System.out.println(i);
			System.out.println("=============");
			System.out.println(empID[i]);
		}
		
		for(int i:empID)
		{
			System.out.println(i);
		}
	}
}
