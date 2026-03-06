package com.dyashin.corejava.day18;

import java.util.HashSet;

public class CollectionHashSet {

	public static void main(String[] args) {

		HashSet<Integer> hs=new HashSet<>();
		hs.add(12);
		hs.add(43);
		hs.add(9000);
		hs.add(9000);
		System.out.println("HashSet: "+hs);
		System.out.println("The hashcode value is "+hs.hashCode());
		System.out.println("Is the hasSet empty"+hs.isEmpty());  
		
	}
}
