package com.dyashin.collectionsframework.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueEx {

	public static void main(String[] args) {
		
		//FIFO queue
//		Queue<Integer> q = new LinkedList<Integer>();
//		q.offer(1);
//		q.offer(2);
//		q.offer(3);
//
////		System.out.println(q.peek());
////		System.out.println(q.poll());
////		System.out.println(q.peek());
////		System.out.println(q.poll());
////		System.out.println(q.poll());
////		System.out.println(q.isEmpty());
//
//		System.out.println(q.isEmpty());
		
		//LIFO queue
//		Stack<Integer> s=new Stack<Integer>();
//		s.push(1);
//		s.push(2);
//		s.push(3);
//		
//		while(!s.isEmpty()) {
//			System.out.println("Peek element: "+s.peek());
////			s.pop();
//			System.out.println(s);
//			System.out.println("Popped element: "+s.pop());
//		}
		
		Deque<Integer> dq=new ArrayDeque<Integer>();
		dq.offerLast(3);
		dq.offerFirst(1);
		dq.offerFirst(2);
//		System.out.println(dq);
		
		dq.pollFirst();
		dq.peekFirst();
		System.out.println(dq);
	}
}
