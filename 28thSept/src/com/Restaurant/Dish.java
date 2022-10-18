package com.Restaurant;

public class Dish {
	
	boolean prep = false;
	
	synchronized void status() {
		
		if(!prep) {
			
			try {
				prep = true;
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else System.out.println("Dish is being prepared..");
		
		notify();
		System.out.println("Dish is being served..");
	}
}
