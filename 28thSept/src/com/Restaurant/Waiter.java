package com.Restaurant;

public class Waiter implements Runnable {
	
	Dish d;
	Thread t;
	
	Waiter(Dish d){
		this.d = d;
		t = new Thread(this, "Waiter");
		t.start();
	}

	@Override
	public void run() {
		d.status();
	}

}
