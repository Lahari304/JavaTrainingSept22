package com.java8.varargs;

public class VarargsDemo {
	
	public static void main(String [] args) {
		display(1);
		display(100, "test", "varargs");
	}
	
	static void display(int num, String... values) {
		System.out.println("Method invoked");
		
		for(String s:values) {
			System.out.println(s);
		}
	}

}
