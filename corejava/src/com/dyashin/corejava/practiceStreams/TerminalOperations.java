package com.dyashin.corejava.practiceStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TerminalOperations {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(9);
		al.add(789);
		al.add(68);
		al.add(25);
		al.add(89);

		Optional<Integer> result = al.stream()
				.reduce((no1, no2) -> no1 + no2);
		System.out.println(result.get());

		System.out.println("-----------------");
		
		Long result2 = al.stream()
				.count();
		System.out.println(result2);

		System.out.println("-----------------");
		
//		Converting arrayList(Any collection) to array
		al.stream()
		.toArray(); 		
		System.out.println(al);
		System.out.println("-----------------");
		//or 
		Object[] obj= al.stream()
				.toArray();
		for(Object o: obj) {
			System.out.println(o);
		}
		
		System.out.println("-----------------");
		
		Optional<Integer> op= al.stream()
		.max((e1, e2) -> e1.compareTo(e2));
		System.out.println(op.get());
		
	}
}
