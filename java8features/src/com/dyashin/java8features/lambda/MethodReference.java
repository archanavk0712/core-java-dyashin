package com.dyashin.java8features.lambda;

import java.util.ArrayList;

//shortcut for lambda expressions
//code readability
//compact
public class MethodReference {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(23);
		al.add(2);
		al.add(3);
		al.add(232);
		al.add(3);
//		al.forEach(ele -> System.out.println(ele));
		al.forEach(System.out::println);
	}

}
