package com.dyashin.calculator.calci;

public class Calculator implements CalculatorInterface {

	@Override
	public void add(double a, double b) {
		double c=a+b;
		System.out.println("Sum of "+a+" and "+b+" is: "+c);
	}

	@Override
	public void sub(double a, double b) {
		double c=a-b;
		System.out.println("Difference of "+a+" and "+b+" is: "+c);
	}

	@Override
	public void mul(double a, double b) {
		double c=a*b;
		System.out.println("Product of "+a+" and "+b+" is: "+c);
	}

	@Override
	public void div(double a, double b) {
		double c=a/b;
		System.out.println("Quotient of "+a+" and "+b+" is: "+c);
	}

	@Override
	public void mod(double a, double b) {
		double c=a%b;
		System.out.println("Remainder of "+a+" and "+b+" is: "+c);
	}
}
