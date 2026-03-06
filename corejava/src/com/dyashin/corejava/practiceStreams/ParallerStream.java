package com.dyashin.corejava.practiceStreams;

import java.util.ArrayList;
import java.util.List;

public class ParallerStream {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();
		al.add(32);
		al.add(12);
		al.add(90);
		al.add(54);
		al.add(32);

		al.parallelStream()
//		.forEach(System.out::println)
				.forEachOrdered(System.out::println);

		System.out.println("---------------");

		
//		To check if a stream is parallel or no
		System.out.println(al.stream().isParallel());
		
		System.out.println("---------------");
		
		
//		To make a normal stream into parallel stream
		al
		.stream()
		.parallel()
		.forEachOrdered(System.out::println);
		
		System.out.println("---------------");

		
	}
}
