package com.dyashin.javapractice.practice;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingElement {
	
	public static int nonRepeat(int []arr) {
		
		Map<Integer, Integer> data =new HashMap<Integer, Integer>();
		
		for(int a:arr) {
			
			if(data.containsKey(a)) {
				data.put(a, data.get(a)+1);
			}else {
				data.put(a, 1);
			}
		}
		
		for(int a:arr) {
			if(data.get(a)==1) {
				return a;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		
		int[] arr= {1,3,5,2,4,5,2,1};
		System.out.println(nonRepeat(arr));
	}
}
