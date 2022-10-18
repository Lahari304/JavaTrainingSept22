package com.java8.defaultAndStaticMethods;

public interface Sayable {

	void sayMore(String msg);
	
	
	// A default method let's a method have a default implementation if the class doesn't override it.
	default void say() {
		System.out.println("Hi, This is a default method");
	}
	
	static void sayLoud(String msg) {
		System.out.println(msg);
	}
}
