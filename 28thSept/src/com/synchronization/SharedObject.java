package com.synchronization;

public class SharedObject {
	
	synchronized void sharedMethod(String arg) {
		System.out.print("[");
		System.out.print(arg);
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println(Thread.currentThread().getName()+ " interrupted");
		}
		System.out.println("]");
	}
}