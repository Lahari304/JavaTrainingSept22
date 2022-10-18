package com.ThreadsLec;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		t.setPriority(1);
		t.setName("Demo Thread");
		System.out.println("Current thread: "+t);
		
		try {
//			new DemoThread1();
			Thread.sleep(2000);
			new DemoThread1();
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}

	}

}
