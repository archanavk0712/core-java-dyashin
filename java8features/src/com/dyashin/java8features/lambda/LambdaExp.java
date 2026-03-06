package com.dyashin.java8features.lambda;

@FunctionalInterface
interface Abc {
	
//	public void rule1();
//	public void add(int n1, int n2);
	public int add(int n1, int n2);
	public static void rule2() {

	}

	public default void rule3() {

	}
}

public class LambdaExp {

	public static void main(String[] args) {

//		Abc a = () -> {
//			System.out.println("Hi");
//		};
//		
//		a.rule1();
		
//		Abc a=(n1,n2)->{
//			System.out.println(n1+n2);
//		};
//		
//		a.add(2, 3);
		
		Abc a=(n1,n2)->{
			return n1+n2;
		};
		
		System.out.println(a.add(20, 30));
		
	}
}
