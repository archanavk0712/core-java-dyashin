package com.dyashin.corejava.practiceOperator;

public class LogicalOperator 
{
	public static void main(String[] args) 
	{
		int i = 1;
        int j = 2;
        
        boolean result1 = (i == 1 && j >= 1);
        
        System.out.println(result1);
        
        boolean result2 = (i > 5 || j == 1);
        
        System.out.println(result2);
        
        System.out.println(!true);
        System.out.println(!(20<5));
	}

}

