package com.dyashin.corejava.practice;

public class InterruptedExceptionEx {
	
	public static void main(String[] args) {

		NewThread n=new NewThread();
		n.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		n.interrupt();
		System.out.println("Main thread interupted the child thread");
	}
}
