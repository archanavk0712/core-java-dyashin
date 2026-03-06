package com.dyashin.javapractice.practice;

import java.util.HashSet;
import java.util.Set;

public class RepeatingElement {

	public static int repeat(int[] arr) {
		Set<Integer> data = new HashSet<Integer>();
		for (int a : arr) {
			if (data.contains(a)) {
				return a;
			}
			data.add(a);
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 5, 2, 5, 6 };
		System.out.println(repeat(arr));
	}
}
