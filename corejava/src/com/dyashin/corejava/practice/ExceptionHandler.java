package com.dyashin.corejava.practice;

public class ExceptionHandler {
	public static void main(String[] args){
		
		System.out.println("111111");
		try {
			System.out.println("222222");
			int i=100/0;
			System.out.println("333333");
		} catch (Exception e) {
			System.out.println("4444444");
			throw e;
		}
		System.out.println("666666");
	}
}