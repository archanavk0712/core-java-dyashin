package com.dyashin.calculator.calci;

public class CalciMain {

	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		c.add(3, 5);
		c.sub(32.5, 25.6);
		c.mul(445, 887.8);
		c.div(24, 6);
		c.mod(64, 57);
	}
}
