package com.dyashin.java8features.lambda;

public class AnonymousInnerClasses {
	public static void main(String[] args) {
//		Thread t = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				for(int i=1;i<=5;i++) {
//					System.out.println("Child "+i);
//				}
//			}
//		});
//		
//		t.start();

		Thread t = new Thread(() -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Child " + 1);
			}
		});
		t.start();
	}
}
