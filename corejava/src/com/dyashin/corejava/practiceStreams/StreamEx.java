package com.dyashin.corejava.practiceStreams;

import java.util.Arrays;

public class StreamEx {

	public static void main(String[] args) {

		int[] arr = { 1, 23, 4, 5, 6 };
//		System.out.println(arr.length);
		
//		IntStream s = Arrays.stream(arr);
//		s.forEach(no -> System.out.println(no));
//		long len=s.count();
//		System.out.println(len);
		System.out.println(Arrays.stream(arr).count());

//		s=s.sorted(); 
//		s.forEach(System.out::println);
		Arrays
		.stream(arr)
		.sorted()
		.forEach(System.out::println);
		
	}
}
