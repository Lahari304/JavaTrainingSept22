package com.threadCommunication;

public class TCommTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q q = new Q();
		new Developer(q);
		new Client(q);
		
		System.out.println("Press ctrl+C to stop::");
	}

}
