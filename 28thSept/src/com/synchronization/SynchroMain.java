package com.synchronization;

public class SynchroMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedObject obj1 = new SharedObject();
		
		Thread1 x1 = new Thread1(obj1, "Spirit");
		Thread1 x2 = new Thread1(obj1, "Of");
		Thread1 x3 = new Thread1(obj1, "ABC");
		
		try {
			x1.t.join();
			x2.t.join();
			x3.t.join();
		}
		catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
		
		System.out.println("\nMain Thread finished.");
				
	}

}
