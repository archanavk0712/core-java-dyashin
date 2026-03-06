package com.dyashin.corejava.day14;

public class TryCatch {

	public static void main(String[] args) {
		
		System.out.println("Starting the program");
		System.out.println("Statement one");
		try {
		System.out.println("Statement two"+(10/0));
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Statement three");
		System.out.println("Statement four");
		
	}

}
