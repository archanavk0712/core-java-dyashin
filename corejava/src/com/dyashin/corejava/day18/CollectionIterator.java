package com.dyashin.corejava.day18;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionIterator {

	public CollectionIterator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(45);
		al.add(4);
		al.add(12);
		al.add(25);
		al.add(2);
		al.add(20);
		Iterator<Integer> i =al.iterator();
		
		while (i.hasNext()) {
			Integer in=(Integer) i.next();
			
			if(in%2==0) {
				System.out.println(in);
			}else {
				i.remove();
			}
		}
	}

}
