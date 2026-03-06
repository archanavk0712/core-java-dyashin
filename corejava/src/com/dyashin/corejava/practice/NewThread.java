package com.dyashin.corejava.practice;

public class NewThread extends Thread{

	@Override
	public void run() {
		try {
//			System.out.println("Thread started") ;
			Thread.sleep(5000);
//			System.out.println("Thread completed");
		} catch (InterruptedException e) {
			System.out.println("Thread was interrupted");
			e.printStackTrace();
		}
	}
}