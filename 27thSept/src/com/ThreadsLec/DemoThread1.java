package com.ThreadsLec;

public class DemoThread1 implements Runnable {
	
	Thread t;
	
	DemoThread1(){
		
		t = new Thread(this, "Thread-1");
		t.setPriority(10);
		System.out.println(t.getName() + " created");
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0; i<5; i++) {
				System.out.println(t.getName() + ": "+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			System.out.println(t.getName()+ " interrupted.");
		}
	}

}
