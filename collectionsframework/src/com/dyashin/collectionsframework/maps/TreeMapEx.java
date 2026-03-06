package com.dyashin.collectionsframework.maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {

		NavigableMap<Integer, String> tm = new TreeMap<Integer, String>((a, b)-> b-a);
		tm.put(1, "a");
		tm.put(4, "b");
		tm.put(2, "c");
		tm.put(3, "d");

		System.out.println(tm);

		Set<Map.Entry<Integer, String>> entrySet = tm.entrySet();

		for (Map.Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		Set<Integer> keysets = tm.keySet();
		for (Integer key : keysets) {
			System.out.println(key + " , " + tm.get(key));
		}
		
		System.out.println(tm.pollFirstEntry());
		System.out.println(tm.ceilingKey(3));
		System.out.println(tm.ceilingEntry(3));
	}
}
