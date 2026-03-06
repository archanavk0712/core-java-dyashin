package com.dyashin.corejava.day18;

import java.util.Stack;

public class CollectionStack {

	public static void main(String[] args) {
		Stack <Integer> s= new Stack<Integer>();
		s.push(2);
		s.push(5);
		s.push(443);
		s.add(15);
		System.out.println("Stack: "+s);
		System.out.println("Element present on the top: "+s.peek());
		
	}

}
