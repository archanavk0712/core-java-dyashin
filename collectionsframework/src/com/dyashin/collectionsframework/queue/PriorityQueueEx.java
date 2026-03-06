package com.dyashin.collectionsframework.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {

//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//		pq.offer(1);
//		pq.offer(100);
//		pq.offer(56);
//		pq.offer(800);
//
//		// top 2 elements
//		List<Integer> top2 = new ArrayList<Integer>();
//
//		int index = 0;
//		while (!pq.isEmpty() && index < 2) {
//			top2.add(pq.poll());
//			index++;
//		}
////		System.out.println(top2);
////		System.out.println(pq);
//
////		Get me the top 3 students according to their maths marks
//
//		List<StudentMarks> sm = new ArrayList<StudentMarks>();
//		sm.add(new StudentMarks(90, 70));
//		sm.add(new StudentMarks(20, 75));
//		sm.add(new StudentMarks(50, 78));
//		sm.add(new StudentMarks(95, 90));
//		sm.add(new StudentMarks(50, 80));
//		PriorityQueue<StudentMarks> p = new PriorityQueue<StudentMarks>(sm);
//		List<StudentMarks> top3 = new ArrayList<StudentMarks>();
//		int indx = 0;
//		while (!p.isEmpty() && indx <3) {
//			top3.add(p.poll());
//			indx++;
//		}
////		System.out.println(top3);
		
////		What if we want top2 elements of bottom2
////		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(new MyCustomComparator());
//		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>((a, b)-> b- a);
//		pq2.offer(1);
//		pq2.offer(100);
//		pq2.offer(56);
//		pq2.offer(800);
////		 top 2 elements
//		List<Integer> top2 = new ArrayList<Integer>();
//
//		int index = 0;
//		while (!pq2.isEmpty() && index < 2) {
//			top2.add(pq2.poll());
//			index++;
//		}
//		System.out.println(top2);
//		System.out.println(pq2);
		
		List<StudentMarks> sm = new ArrayList<StudentMarks>();
		sm.add(new StudentMarks(90, 70));
		sm.add(new StudentMarks(20, 75));
		sm.add(new StudentMarks(50, 78));
		sm.add(new StudentMarks(95, 90));
		sm.add(new StudentMarks(50, 80));
		PriorityQueue<StudentMarks> p = new PriorityQueue<StudentMarks>((s1, s2) ->
		{
			System.out.println("Comaparator's CompareTo() is called");
			return s2.getPhysics() - s1.getPhysics();
		});
		for(StudentMarks smarks: sm) {
			p.add(smarks);
		}
		List<StudentMarks> top3 = new ArrayList<StudentMarks>();
		int indx = 0;
		while (!p.isEmpty() && indx <3) {
			top3.add(p.poll());
			indx++;
		}
		System.out.println(top3);
		
	}
}
