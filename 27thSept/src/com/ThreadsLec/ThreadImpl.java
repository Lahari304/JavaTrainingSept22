package com.ThreadsLec;

public class ThreadImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		DemoThread1 t = 
				new ThreadDemo2("Child-1");
		
		try {
			for(int i=0; i<5; i++){
				System.out.println("Main Thread: "+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Main Thread Interrupted.");
		}
		
		System.out.println("Main Thread finished.");
	}

}
