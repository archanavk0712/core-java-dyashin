package com.dyashin.java8features.lambda;

interface Pqr {
	default void calSalary(int sal) {
		System.out.println(sal * 12);
	}
}

interface Pqr2 {
	default void calSalary(int sal) {
		System.out.println(sal * 0);
	}
}

public class DefaultMethods implements Pqr, Pqr2 {
	public static void main(String[] args) {
		DefaultMethods p = new DefaultMethods();
		p.calSalary(20000);

//		or
//		Pqr p1 = new PrivateAndDefaultMethods();
//		p1.calSalary(20000);
	}

	@Override
	public void calSalary(int sal) {
		Pqr.super.calSalary(sal);
		Pqr2.super.calSalary(sal);
	}
}
