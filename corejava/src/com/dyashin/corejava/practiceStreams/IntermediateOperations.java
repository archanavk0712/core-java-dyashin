package com.dyashin.corejava.practiceStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class IntermediateOperations {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 40, 1, 32, 13, 54, 53 };

//		Arrays
//			.stream(arr)
//			.sorted()
//			.forEach(System.out::println);;

//		OptionalDouble od= Arrays
//				.stream(arr) // Intermediate Operation
//				.average(); // Intermediate Operation
//		System.out.println(od.getAsDouble());

//		OptionalInt oi= Arrays
//				.stream(arr) // Intermediate Operation
//				.max(); // Intermediate Operation
//		System.out.println(oi.getAsInt());

//		OptionalInt oi= Arrays
//				.stream(arr) // Intermediate Operation
//				.min(); // Intermediate Operation
//		System.out.println(oi.getAsInt());

//		OptionalInt oi= Arrays
//				.stream(arr) // Intermediate Operation
//				.findFirst(); // Intermediate Operation
//		System.out.println(oi.getAsInt());

//		OptionalInt oi= Arrays
//				.stream(arr) // Intermediate Operation
//				.findAny(); // Intermediate Operation
//		System.out.println(oi.getAsInt());

//		Long ol= Arrays
//				.stream(arr) // Intermediate Operation
//				.count(); // Intermediate Operation
//		System.out.println(ol);

//		Arrays.stream(arr) // Intermediate Operation
//				.distinct() // Intermediate Operation
//				.forEach(System.out::println); // Terminal Operation

		Arrays.stream(arr) // Intermediate Operation
				.filter(e -> e%4==0 ) // Intermediate Operation
				.forEach(System.out::println);
		
		System.out.println("----------------");
		
		List<String> li = new ArrayList<String>();
		li.add("Abhinaya");
		li.add("Archana");
		li.add("Sindhu");
		li.add("Harshitha");
		li.add("Moulya");
		li.add("Bhoomika");
		
		li.stream()
		.map(word -> word.toUpperCase())
		.forEach(System.out::println);
		
		System.out.println("----------------");
		
		li.stream()
		.map(name -> name+" ,BE")
		.forEach(System.out::println);
		
		System.out.println("----------------");
		
		List<Integer> al= new ArrayList<Integer>();
		al.add(12);
		al.add(9);
		al.add(789);
		al.add(68);
		al.add(25);
		al.add(89);
//		System.out.println(al);
		
		al.stream()
		.map(no -> no/2)
		.forEach(System.out::println);
		
		System.out.println("----------------");
		
		List<Integer> hs= new ArrayList<Integer>();
		hs.add(12);
		hs.add(9);
		hs.add(789);
		hs.add(68);
		hs.add(25);
		hs.add(89);
		
		hs.stream()
		.limit(2)
		.forEach(System.out::println);

		System.out.println("----------------");
		
		hs.stream()
		.skip(2)
		.forEach(System.out::println);
		
		System.out.println("----------------");
		
		hs.stream()
		.limit(5)
		.skip(2)
		.forEach(System.out::println);

		
	}
}
