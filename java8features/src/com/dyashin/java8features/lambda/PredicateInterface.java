package com.dyashin.java8features.lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public class PredicateInterface {

	public boolean test(int age) {
		if (age > 60) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

//		PredicateInterface p=new PredicateInterface();
//		System.out.println(p.test(21));

//		Predicate<Integer> p= (no) -> (no>60);
//		System.out.println(p.test(23));

//		Predicate<String> p2= name -> (name.length()>8);
//		System.out.println(p2.test("123456dgasf"));

//		ArrayList<Integer> al=new ArrayList<Integer>();
//		System.out.println(al.size());
//		
//		Predicate<Collection> p3=aa->aa.size()>0;
//		System.out.println(p3.test(al));
//		al.add(10);
//		System.out.println(p3.test(al));

//		Predicate in a array
//		int[] arr = { 1, 2, 3, 5, 2, 4, 3 };
//		Predicate<Integer> p = no -> (no % 2 != 0);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(p.test(arr[i]));
//		}

//		negate
		int[] arr = { 1, 2, 3, 5, 2, 4, 3, 12 };
		Predicate<Integer> p = no -> (no % 2 != 0);
		Predicate<Integer> p2 = no -> (no <=10 );
//		check(p, arr);
//		check(p.negate(), arr);
		
//		or
		check(p.or(p2), arr);
		
//		add
//		check(p.and(p2), arr);
		
	}

	private static void check(Predicate<Integer> p, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean result =p.test(arr[i]);
			if(result) {
				System.out.println(arr[i]);
			}
		}
	}
}
