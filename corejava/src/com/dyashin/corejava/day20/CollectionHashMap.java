package com.dyashin.corejava.day20;

import java.util.HashMap;
import java.util.Set;

public class CollectionHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(12, "abc");
		hm.put(13, "lmn");
		hm.put(14, "pqr");
		hm.put(15, "uvm");
		hm.put(16, "xyz");
		System.out.println(hm);
		
	 	Set<Integer> set = hm.keySet();
	 	System.out.println("Keyset: "+set);
	 	
	 	for(Integer s:set) {
	 		System.out.println("key: "+s+", Value: "+hm.get(s));
	 	}
	 	
	 	System.out.println(hm.values());
	}
}
