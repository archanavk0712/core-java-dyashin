package com.dyashin.corejava.practiceStreams;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HashMapStreams {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("Archana", 100);
		hm.put("Abhinaya", 200);
		hm.put("Sindhu", 300);
		hm.put("Bhoomi", 500);
		hm.put("Harshitha", 400);

		hm.keySet().stream().sorted().forEach(System.out::println);

		System.out.println("--------------");

//		Cannot sort with an entrySet as it contains key+value=entry
//		hm
//		.entrySet()
//		.stream()
//		.sorted()
//		.forEach(System.out::println);
//		
//		System.out.println("--------------");

		hm
		.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);

		System.out.println("--------------");

		hm
		.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);

		System.out.println("--------------");

//		Hashmap to Any other collections
//		List<String> l= hm
		Set<String> l= hm
		.keySet()
		.stream()
//		.collect(Collectors.toList());
		.collect(Collectors.toSet());
		System.out.println(l);
		
		System.out.println("--------------");
		
		boolean b=l
		.stream()
		.anyMatch(name -> name.endsWith("a"));
		System.out.println(b);
		
		System.out.println("--------------");
	}
}
