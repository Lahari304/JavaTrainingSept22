package com.threadCommunication;

public class Client implements Runnable {
	
	Q q;
	Thread t;
	
	public Client(Q q) {
		this.q = q;
		t = new Thread(this, "Client");
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			q.get();
		}
	}

}
