package com.dyashin.corejava.day21;

class ThreadMy extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
	
			System.out.println(Thread.currentThread().getPriority()+" "+Thread.currentThread());
//			Thread.yield();
//			try {
//				Thread.sleep(30000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			
			System.out.println("Child thread inside run method");
		}
	}	
}

public class StopThread {

	public static void main(String[] args) {
		
		System.out.println("Thread Current: "+Thread.currentThread());
		ThreadMy ft = new ThreadMy();
		ThreadMy ft2 = new ThreadMy();
		ft.setPriority(10);
		ft.start();
		ft2.start();	
		try {
			ft.join(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
