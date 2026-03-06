package com.dyashin.collectionsframework.lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<Integer> list = new java.util.ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		Integer[] arr = list.toArray(new Integer[0]);
		for(int x: arr) {
			System.out.print(x+" , ");
		}
		
		System.out.println(list);

//		int replaced = list.set(1, 200);
//		System.out.println("Element that got replaced : " + replaced);
//		System.out.println(list);
		
		//copy of the list 
//		List<Integer> list2= new java.util.ArrayList<Integer>(list);
//		list2.add(6);
//		list2.add(7);
//		System.out.println(list2);
		
//		List<Integer> list3= new java.util.ArrayList<Integer>();
//		list3.add(8);
//		list3.add(9);
//		list3.addAll(list);
//		System.out.println("Index is: "+list3.indexOf(200));
//		System.out.println("Last index is: "+list3.indexOf(5));
//		System.out.println(list3);
		
		List<Integer> list4= list.subList(0, 3);
		list4.set(0, 100);
		System.out.println(list4);
		
		Integer ar[]=new Integer[] {1,2,2,4,2,34,6,34,2};
		Arrays.sort(ar);
//		Collections.sort(ar, Collections.reverseOrder());
		
		List<Integer> lst= Arrays.asList(1,3,2,3,5);
		
		Collections.binarySearch(lst, 4 );
	}
}
