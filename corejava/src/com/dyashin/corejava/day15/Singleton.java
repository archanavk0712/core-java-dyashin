package com.dyashin.corejava.day15;

public class Singleton {

	private static Singleton singleton ;
	
	private Singleton() {
		System.out.println("Default method");
	}
	
	public static Singleton getInstance() {
		if(singleton==null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
	public void display() {
		System.out.println("Display method");
	}
	
}