package com.dyashin.corejava.day13;

public class StringClass {
	
	

	public StringClass() {

	}

	public static void main(String[] args) {

		String name="Archana";
		String s=new String("Arc");
		System.out.println(name.equals(s));       //Checks if only the value is equal or not
		System.out.println(name.length());
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf(2));
		System.out.println(name.replace('a', 'e'));
		System.out.println(name.substring(3));
	}

}
