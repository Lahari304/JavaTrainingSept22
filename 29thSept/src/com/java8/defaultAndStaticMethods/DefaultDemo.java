package com.java8.defaultAndStaticMethods;

public class DefaultDemo implements Sayable {

	@Override
	public void sayMore(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable obj = new DefaultDemo();
		
		obj.say();
		
		Sayable.sayLoud("Loud and Clear");

	}

}
