package com.dyashin.corejava.day17;

import java.util.ArrayList;

public class CollectionArrayList {
	
	public static void main(String args[]) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(45);
		al.add(4);
		al.add(12);
		al.add(25);
		al.add(2);
		al.add(20);
		al.add(null);
	System.out.println("ArrayList :" + al);
//		for(int a: al) {
//			System.out.println(a);
		}

	}
//}
//size isn't defined, insertion order is preserved , duplicates and null values are allowed
//array list stores data in indexing format
