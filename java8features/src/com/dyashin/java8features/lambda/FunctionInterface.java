package com.dyashin.java8features.lambda;

import java.util.function.Function;

public class FunctionInterface {
	public static void main(String[] args) {
		
		Function<String, Integer> f= name -> name.length();
		System.out.println(f.apply("Hi"));
	}
}
