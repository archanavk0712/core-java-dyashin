package com.dyashin.corejava.day20;

class FirstThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread inside run method");
		}
	}

	public void run(String s) {
		System.out.println(s);
	}

	@Override
	public void start() {
		System.out.println("Overriden start()");
	}
}

public class ThreadClass {

	public static void main(String[] args) {

		FirstThread ft = new FirstThread();
//		ft.run();     // if used this it will not create a thread only, it will just run it sequentially
		ft.start(); // searches for the run() and executes it
		
		ft.run("Overloaded method");
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}
	}

}
