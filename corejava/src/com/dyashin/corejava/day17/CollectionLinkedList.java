package com.dyashin.corejava.day17;

import java.util.LinkedList;

public class CollectionLinkedList {

	public static void main(String args[]) {
    
		LinkedList<String> list = new LinkedList<String>();
		list.add("A");            // 1
	    list.addFirst("B");       // 2
	    list.addLast("C");        // 3
	    list.removeFirst();       // 4
	    list.removeLast();        // 5
	    list.add("D");            // 6
	    System.out.println(list.get(0)); // 7
	    list.set(0, "E");         // 8
	    System.out.println(list.contains("D")); // 9
	    list.clear();             // 10
	    System.out.println(list);
		
}
}