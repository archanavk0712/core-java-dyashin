package com.dyashin.java8features.lambda;

interface Lmn {
	static void test() {
		System.out.println("Inside test()");
	}
}

public class StaticMethod {
	public static void main(String[] args) {
		Lmn.test();
//		StaticMethod.test();
	}

}
