package com.dyashin.corejava.day23;

@FunctionalInterface					//functional interface
interface Simple {
	int add(int a, int b);
}

//class SimpleClass implements Simple {
//
//	@Override
//	public int add(int a, int b) {
//
//		int c = a + b;
//		return c;
//	}
//}

public class Java8Features {

	public static void main(String[] args) {

		Simple s=(a,b) -> a+b;
		System.out.println(s.add(2, 3)); 
	}

}
