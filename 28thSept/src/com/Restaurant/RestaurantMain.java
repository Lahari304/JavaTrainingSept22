package com.Restaurant;

public class RestaurantMain {

	public static void main(String[] args) {
		
		Dish d = new Dish();
		
		Waiter w = new Waiter(d);
		Kitchen k = new Kitchen(d);
		
		try {
			w.t.join();
			k.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Dish is served.");
	}

}
