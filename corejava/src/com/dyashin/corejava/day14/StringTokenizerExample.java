package com.dyashin.corejava.day14;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		StringTokenizer s = new StringTokenizer("This is a string tokenizer");
		while (s.hasMoreTokens()) {
		System.out.println(s.nextToken());
		}
		System.out.println("=================================");
		
		StringTokenizer st = new StringTokenizer("This,is,a,string,tokenizer",",");
		while (st.hasMoreTokens()) {
		System.out.println(st.nextToken());
		}
		System.out.println("=================================");
		
		String s1="This is a String";
		String arr[]=s1.split(" ");
		for(String i:arr) {
			System.out.println(i); 
		} 
		
	}
}
