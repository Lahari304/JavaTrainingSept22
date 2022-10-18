package com.threadCommunication;

public class Developer implements Runnable {
	
	Q q;
	Thread t;
	
	public Developer(Q q) {
		this.q = q;
		t = new Thread(this, "Developer");
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(true) {
			q.put(i++);
		}
	}

}
