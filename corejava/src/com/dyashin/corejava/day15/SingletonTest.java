package com.dyashin.corejava.day15;

public class SingletonTest {

	public static void main(String[] args) {

		Singleton singleton =Singleton.getInstance();  
		Singleton singleton1 =Singleton.getInstance();
		System.out.println(singleton == singleton1);
		singleton.display();
	}

}

