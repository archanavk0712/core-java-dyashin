package com.dyashin.corejava.day14;

public class DefaultExceptionHandler {

	public static void stuff() {
		doStuff();
		System.out.println("Inside the stuff()");
	}
	
	public static void doStuff() {
		System.out.println("Inside the doStuff()"+(10/0));
	}
	public static void main(String[] args) {
		stuff();
	}

}
