package com.synchroBank;

public class Thread1 implements Runnable {
	
	Account acc;
	Thread t;
	int amt;
	
	public Thread1(Account acc, int amt) {
		this.acc = acc;
		this.amt = amt;
		this.t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			acc.withdrawSync(amt);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
