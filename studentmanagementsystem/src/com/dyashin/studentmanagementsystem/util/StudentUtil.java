package com.dyashin.studentmanagementsystem.util;

import java.util.Scanner;

public class StudentUtil {
	private static Scanner scanner = new Scanner(System.in);
	
	public static int  getInt(String message) {
		System.out.println(message);
		return scanner.nextInt();
	}
	
	public static String  getString(String message) {
		System.out.println(message);
		scanner.nextLine();
		return scanner.nextLine();
	}
}

