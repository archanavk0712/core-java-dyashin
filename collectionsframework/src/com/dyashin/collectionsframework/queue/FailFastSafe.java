package com.dyashin.collectionsframework.queue;

import java.util.ArrayList;
import java.util.List;

public class FailFastSafe {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");

		for (String s : list) {
//		    list.add("C");   //modifying while iterating
			System.out.println(s);
			list.add("D");
		}
	}
}
