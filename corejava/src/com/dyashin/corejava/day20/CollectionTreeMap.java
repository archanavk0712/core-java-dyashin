package com.dyashin.corejava.day20;

import java.util.Comparator;
import java.util.TreeMap;

class CollectionTreeMapComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 > o2) {
			return -1;
		}else if(o1 < o2) {
			return +1;
		}else {
			return 0;
		}
	}
	
}

public class CollectionTreeMap {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(new CollectionTreeMapComparator());
		tm.put(12, "abc");
		tm.put(13, "lmn");
		tm.put(14, "pqr");
		tm.put(15, "uvm");
		tm.put(16, "xyz");
		System.out.println(tm);
	}

}
