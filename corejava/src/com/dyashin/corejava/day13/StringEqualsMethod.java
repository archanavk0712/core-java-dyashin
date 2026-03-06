package com.dyashin.corejava.day13;

public class StringEqualsMethod {

	public static void main(String[] args) {

		String name="Hello";
		String name1="Hello";
		String name2=new String("Hello");
		String name3=new String("Hello");
		System.out.println(name2.equals(name1));
		System.out.println(name==name3);
	}

}
