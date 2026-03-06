package com.dyashin.java8features.lambda;

@FunctionalInterface
interface Ctr {
	public void display(int no);
}

public class MethodReference2 {
	
	int price;
	public MethodReference2(int price) {
		System.out.println(price);
	}

	public static void show(int val) {
		System.out.println(val);
	}

	public static void main(String[] args) {
//		Ctr c = a -> System.out.println(a);
//		c.display(10);
		
//		MethodReference2 m=new MethodReference2();
//		Ctr c1= m::show;
//		Ctr c1= new MethodReference2(21)::show;
		
//		if methods is static
//		Ctr c=MethodReference2::show;
//		c.display(105);
		
//		for constructore
		Ctr c=MethodReference2::new;
		c.display(105);
	}
}
