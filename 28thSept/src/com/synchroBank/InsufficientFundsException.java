package com.synchroBank;

public class InsufficientFundsException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	InsufficientFundsException(){
		System.out.println("***Insufficient funds***");
	}
}
