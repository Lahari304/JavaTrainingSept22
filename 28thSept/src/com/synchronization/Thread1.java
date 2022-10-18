package com.synchronization;

public class Thread1 implements Runnable {
	
	String arg;
	SharedObject obj1;
	Thread t;
	
	public Thread1(SharedObject obj1, String arg) {
		this.obj1 = obj1;
		this.arg = arg;
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		obj1.sharedMethod(arg);
	}

}
