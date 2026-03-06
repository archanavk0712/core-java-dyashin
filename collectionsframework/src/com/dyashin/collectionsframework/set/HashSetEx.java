package com.dyashin.collectionsframework.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.dyashin.collectionsframework.queue.StudentMarks;

public class HashSetEx {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
//		System.out.println(s);
//		s.add(2);
//		System.out.println(s);
//		s.remove(2);
//		System.out.println(s);
////		s.clear();
////		System.out.println(s);
		
		Set<Integer> s2= new HashSet<Integer>();
		s2.add(0);
		s2.add(3);
		s2.add(4);
		s2.add(5);
		s2.add(1);
		s2.add(67);
		s2.add(34);
//		System.out.println(s);
//		System.out.println(s2);
//		
		System.out.println(s.contains(1));
		System.out.println(s.contains(299));
		
//		System.out.println("After retaining");
//		s.retainAll(s2);
//		System.out.println(s);
//		System.out.println(s2);
//		
//		System.out.println("After removing");
//		s.removeAll(s2);
//		System.out.println(s);
//		System.out.println(s2);
		
//		Set<Integer> s3= new LinkedHashSet<>();
//		s3.add(0);
//		s3.add(3);
//		s3.add(4);
//		s3.add(5);
//		s3.add(1);
//		s3.add(67);
//		s3.add(34);
//		
//		
//		for(int x: s2) {
//			System.out.println(x);
//		}
//		
//		System.out.println("Linked hashset");
//		for(int x: s3) {
//			System.out.println(x);
//		}
		
		List<StudentMarks> sm = new ArrayList<StudentMarks>();
		sm.add(new StudentMarks(90, 70));
		sm.add(new StudentMarks(20, 75));
		sm.add(new StudentMarks(50, 78));
		sm.add(new StudentMarks(95, 90));
		sm.add(new StudentMarks(50, 80));
		
		Set<StudentMarks> s4= new HashSet<>(sm);
		
		System.out.println(sm.contains(new StudentMarks(90, 70)));
		
		for(StudentMarks x: s4) {
			System.out.println(x);
		}
		
		
		
	}
}
