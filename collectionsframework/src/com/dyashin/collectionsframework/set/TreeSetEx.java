package com.dyashin.collectionsframework.set;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

import com.dyashin.collectionsframework.queue.StudentMarks;

public class TreeSetEx {
	
	public static void main(String[] args) {
		
//		Set<StudentMarks> treeset= new TreeSet<StudentMarks>((s1, s2) -> s2.getPhysics()- s1.getPhysics());
//		treeset.add(new StudentMarks(90, 70));
//		treeset.add(new StudentMarks(20, 75));
//		treeset.add(new StudentMarks(50, 78));
//		treeset.add(new StudentMarks(95, 90));
//		treeset.add(new StudentMarks(50, 80));
//		
//		for(StudentMarks x: treeset) {
//			System.out.println(x);
//		}
		
		NavigableSet<Integer> s1= new TreeSet<Integer>();
		s1.add(4);
		s1.add(1);
		s1.add(5);
		s1.add(1);
		s1.add(78);
		s1.add(34);
		
		for(int x: s1) {
			System.out.print(x+" , ");
		}
		
		System.out.println(s1.floor(50));
		System.out.println(s1.ceiling(5));
		System.out.println(s1.higher(5));
		System.out.println(s1.lower(50));
		
	}
}
