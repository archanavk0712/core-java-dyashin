package com.dyashin.corejava.day20;


class MyFirstThread implements Runnable{

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
		}
	}
	
}
public class RunnableInterface {

	public static void main(String[] args) {
		
		MyFirstThread runnable = new MyFirstThread();
		Thread thread = new Thread(runnable);
		thread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
		
	}

}
