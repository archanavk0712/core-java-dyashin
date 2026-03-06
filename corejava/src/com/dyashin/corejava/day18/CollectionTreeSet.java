package com.dyashin.corejava.day18;

import java.util.TreeSet;

public class CollectionTreeSet {

	
	public static void main(String[] args) {
		
		//Default sorting
		TreeSet<Integer> ts =new TreeSet<Integer>();
		ts.add(23);
		ts.add(53);
		ts.add(6);
		ts.add(223);
		ts.add(54);
		ts.add(64);
		ts.add(275);
		ts.add(64);
		System.out.println("TreeSet: "+ts);
		System.out.println(ts.lower(53));  // Returns the greatest element in this set strictly less than the given element, or {@code null} if there is no such element.
		System.out.println(ts.floor(53));  //Returns the greatest element in this set less than or equal to the given element, or {@code null} if there is no such element.
		System.out.println(ts.ceiling(23));  //Returns the least element in this set greater than or equal to the given element, or {@code null} if there is no such element.
		System.out.println(ts.higher(23));  //Returns the least element in this set strictly greater than the given element, or {@code null} if there is no such element.
		System.out.println(ts);
		System.out.println("=====================================");

		//Custom sorting
		TreeSet<Integer> ts1 =new TreeSet<Integer>(new CollectionTreeSetComparator());
		ts1.add(23);
		ts1.add(53);
		ts1.add(6);
		ts1.add(223);
		ts1.add(54);
		ts1.add(64);
		ts1.add(275);
		ts1.add(64);
		System.out.println("TreeSet: "+ts1);
		System.out.println(ts.lower(53));  // Returns the greatest element in this set strictly less than the given element, or {@code null} if there is no such element.
		System.out.println(ts.floor(53));  //Returns the greatest element in this set less than or equal to the given element, or {@code null} if there is no such element.
		System.out.println(ts.ceiling(23));  //Returns the least element in this set greater than or equal to the given element, or {@code null} if there is no such element.
		System.out.println(ts.higher(23));  //Returns the least element in this set strictly greater than the given element, or {@code null} if there is no such element.
		System.out.println(ts1);
		
	}
}

