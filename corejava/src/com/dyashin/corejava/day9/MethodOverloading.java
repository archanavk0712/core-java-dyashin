package com.dyashin.corejava.day9;

public class MethodOverloading {
	public MethodOverloading() {
		System.out.println("Default Constructor");
	}

	public void add() {
		System.out.println("Addition");
	}

	public void add(int x) {
		System.out.println("Addition not possible for single operand ");
	}

	public void add(int x, int y) {
		int z = x + y;
		System.out.println("Addition: " + z);
	}
	
	public void add(double x, double y) {
		double z = x + y;
		System.out.println("Addition: " + z);
	}

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.add();
		m.add(2);
		m.add(2, 2);
		m.add(2.3, 2.4);
	}
}
