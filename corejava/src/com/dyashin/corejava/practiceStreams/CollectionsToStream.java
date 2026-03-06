package com.dyashin.corejava.practiceStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsToStream {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(6);
		l.add(64);
		l.add(134);
		l.add(6);
		l.add(23);
		
//		System.out.println(l.stream().count());
	
//		l.stream()
//		.distinct()
//		.forEach(System.out::pr intln);
		
//		l.stream()
//		.distinct()
//		.sorted()
//		.forEach(System.out::println);
		
//		l.stream()
//		.distinct()
//		.sorted((e1,e2) -> e2-e1)
//		.forEach(System.out::println);
		
		List<String> li = new ArrayList<String>();
		li.add("fghj");
		li.add("xcvbn");
		li.add("rtyuiwe");
		li.add("oikjnureu");
		li.add("edfcv");
		li.add("fghj");
		
//		li.stream()
//		.distinct()o
////		.sorted((e1, e2) -> 0)
////		.sorted((e1, e2) -> -1)
////		.sorted(Collections.reverseOrder())
////		.sorted((e1, e2) -> e1.compareTo(e2))
//		.sorted((e1, e2) -> e2.compareTo(e1))
//		.forEach(System.out::println);
		
	}
}
