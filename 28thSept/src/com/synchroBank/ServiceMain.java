package com.synchroBank;

public class ServiceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc = new Account(10000);
//		int amt = 1000;
		
		Thread1 x1 = new Thread1(acc, 50);
		Thread1 x2 = new Thread1(acc, 290);
		Thread1 x3 = new Thread1(acc, 3000);
		
		try {
			x1.t.join();
			x2.t.join();
			x3.t.join();
		}
		catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
		
		System.out.println("### THREAD 2 ###");
		Thread2 t1 = new Thread2(acc, 1000);
		Thread2 t2 = new Thread2(acc, 30000);
		Thread2 t3 = new Thread2(acc, 650);
		
		try {
			t1.t.join();
			t2.t.join();
			t3.t.join();
		}
		catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
		
		System.out.println("\nMain Thread finished.");
				
	}

}
