package com.dyashin.corejava.day18;

import java.util.Enumeration;
import java.util.Vector;

public class CollectionEnumeration {

	
	public CollectionEnumeration() {
		System.out.println("Deafult Constructor");
	}

	public static void main(String[] args) {
		Vector <Integer> v =new Vector<>();
		v.add(2);
		v.add(5);
		v.add(7);
		v.add(56);
		v.add(23);
		Enumeration<Integer> e =v.elements();
		
		while (e.hasMoreElements()) {
			Integer in =(Integer) e.nextElement();
		
			if(in%2==0) {
				System.out.println(in);
			}
		}
		
	}
}
