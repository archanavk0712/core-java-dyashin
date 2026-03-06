package com.dyashin.collectionsframework.lists;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
//		[1,2,3]
		ListIterator<Integer> iterator=list.listIterator();
		System.out.println(iterator.next());	// return item[index++]
		System.out.println(iterator.next());
		System.out.println(iterator.previous());	//return [index--]item
	}
}
