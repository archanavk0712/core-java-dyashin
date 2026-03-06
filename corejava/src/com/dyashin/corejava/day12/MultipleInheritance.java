package com.dyashin.corejava.day12;

interface School{
	
	public void studyname();
}

interface College{
	public void study();
}

class Student implements School,College{
	
	public void studyname() {
		System.out.println("The student name studies");
	}
	
	public void study() {
		System.out.println("The student studies");
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		Student s=new Student();
		s.studyname();
		s.study();
		
	}

}
