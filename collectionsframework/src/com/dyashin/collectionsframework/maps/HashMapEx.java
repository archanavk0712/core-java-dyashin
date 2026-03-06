package com.dyashin.collectionsframework.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		
		System.out.println(map.get("fd"));
		System.out.println(map.getOrDefault("fd", 0));
		System.out.println(map.getOrDefault("c", 0));
		
		System.out.println(map.containsKey("c"));
		
		Map<Integer, List<Integer>> adj= new HashMap<Integer, List<Integer>>();
		
//		if(adj.get(1)==null) {
//			adj.put(1, new ArrayList<>());
//		}
//		adj.get(1).add(2);
		
//		adj.computeIfAbsent(1, f -> new ArrayList<>()).add(2);
		
		Set<Map.Entry<String, Integer>> entrySet= map.entrySet();
		
		for(Map.Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		Set<String> keysets =map.keySet();
		for(String key: keysets) {
			System.out.println(key+" , "+map.get(key));
		}
	}
}
