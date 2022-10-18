package com.Restaurant;

public class Kitchen implements Runnable {

	Dish d;
	Thread t;
	
	Kitchen(Dish d){
		this.d = d;
		t = new Thread(this, "Kitchen");
		t.start();
	}

	@Override
	public void run() {
		d.status();
	}

}
