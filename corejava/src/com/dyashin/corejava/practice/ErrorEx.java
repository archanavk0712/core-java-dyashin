package com.dyashin.corejava.practice;

public class ErrorEx {

	public static void main(String[] args) {
//		int [] arr=new int [Integer.MAX_VALUE];
		
		int age=-3;
		assert age>=0: "Age cannot be negative";
		System.out.println("A valid age");
		
	}
}

//Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit at corejava/com.dyashin.corejava.practice.ErrorEx.main(ErrorEx.java:6)
// If u get the above error ->right click on the file and select run as> run configurations> arguments >vm arguments> type "-ea"> select apply> click on run