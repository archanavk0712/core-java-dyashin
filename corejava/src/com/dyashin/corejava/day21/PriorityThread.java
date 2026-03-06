package com.dyashin.corejava.day21;


class FirstThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread inside run method");
		}
	}	
}

public class PriorityThread {

	public static void main(String[] args) {
		
		System.out.println("Current thread: "+Thread.currentThread());
		
		FirstThread ft = new FirstThread();
		System.out.println("Thread name: "+ft.getName());
		ft.setName("New thread");
		System.out.println("Thread updated name: "+ft.getName());
		System.out.println("Priority of thread: "+ft.getPriority());
		ft.setPriority(3);
		System.out.println("Priority of thread: "+ft.getPriority());
		ft.start(); 
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}
		
		
	}

}