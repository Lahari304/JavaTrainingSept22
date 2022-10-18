package com.java8.FunctionalInterface;

import java.util.Scanner;
import java.util.function.Predicate;

public class LambdaDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calculator obj = (a, b) -> (a+b);
		
		System.out.println(obj.getSum(1, 2));
		
		Predicate<String> p = s -> (s.compareTo("Lahari") == 0);
		
		System.out.println(p.test(sc.next()));
	}
}
