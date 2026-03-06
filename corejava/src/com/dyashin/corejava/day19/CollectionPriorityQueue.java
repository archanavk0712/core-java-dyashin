package com.dyashin.corejava.day19;

import java.util.Comparator;
import java.util.PriorityQueue;

class CollectionPriorityQueueComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
//		if(o1 > o2) {
//			return -1;
//		}else if(o1 < o2) {
//			return +1;
//		}else {
//			return 0;
//		}
		
		return Integer.compare(o2, o1);
	}
	
}

public class CollectionPriorityQueue {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new CollectionPriorityQueueComparator());
		pq.offer(23);
		pq.offer(76);
		pq.offer(53);
		pq.offer(36);
		pq.offer(86);
		pq.offer(35);
		pq.offer(36);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
	}

}
