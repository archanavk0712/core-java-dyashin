package com.dyashin.corejava.day22;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the name: ");
		String names=in.next();
		System.out.println("Name: "+names);
		
		System.out.print("Enter the intVal: ");
		int intVal=in.nextInt();
		System.out.println("intValue: "+intVal);

		System.out.print("Enter the doubleVal: ");
		double doubleVal=in.nextDouble();
		System.out.println("doubleValue: "+doubleVal);
		
		System.out.print("Enter the floatVal: ");
		float floatVal=in.nextFloat();
		System.out.println("floatValue: "+floatVal);
		in.close();
	}

}
