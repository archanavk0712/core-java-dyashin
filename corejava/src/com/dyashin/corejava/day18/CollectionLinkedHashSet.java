package com.dyashin.corejava.day18;

import java.util.LinkedHashSet;

public class CollectionLinkedHashSet {

	public static void main(String[] args) {
	
		LinkedHashSet<Integer> lhs =new LinkedHashSet<Integer>();
		lhs.add(1);
		lhs.add(3);
		lhs.add(53);
		lhs.add(35);
		lhs.add(65);
		lhs.add(53);
		lhs.add(24);
		System.out.println("Linked HashSet: "+lhs);
	}
}
