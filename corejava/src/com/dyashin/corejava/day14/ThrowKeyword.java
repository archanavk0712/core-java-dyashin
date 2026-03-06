package com.dyashin.corejava.day14;

public class ThrowKeyword {

	public static void main(String[] args) {

		int age=15;
		if (age<18) {
			// Explicitly throwing an exception
			throw new ArithmeticException("You must be 18 or above to vote");
		}
		System.out.println("You are eligible to vote");
	}

}
