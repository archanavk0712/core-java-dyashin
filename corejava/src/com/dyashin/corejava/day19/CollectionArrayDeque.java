package com.dyashin.corejava.day19;

import java.util.ArrayDeque;

public class CollectionArrayDeque {

	public static void main(String[] args) {

	ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
	ad.addFirst(23);
	ad.add(342);
	ad.add(645);
	ad.addLast(42);
	System.out.println(ad);
	}

}
