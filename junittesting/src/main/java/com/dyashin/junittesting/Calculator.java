package com.dyashin.junittesting;

public class Calculator {

	public int add(int x,int y) {
		return x+y;
	}
	
//	CalculatorService calculatorService;
//	
//	public int add(int x,int y) {
//		return calculatorService.add(2, 3);
//	}
	
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.add(2, 3)); 
	}
}
