package com.synchroBank;

public class Account{
	
	int balance;
	
	public Account(int balance){
		this.balance = balance;
	}
	
	private boolean withdraw(int amt) throws InsufficientFundsException {
		
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println(Thread.currentThread().getName()+ " interrupted");
		}
		
		try {
		if(amt > this.balance) {
			throw new InsufficientFundsException();
		}
		}
		catch(InsufficientFundsException e) {
			return false;
		}
		
		balance-= amt;
		System.out.println("Remaining balance: "+balance);
		return true;
	}
	
	synchronized boolean withdrawSync(int amt) throws InsufficientFundsException {
		return withdraw(amt);
	}
	
	boolean withdrawNonSync(int amt) throws InsufficientFundsException {
		return withdraw(amt);
	}
}
