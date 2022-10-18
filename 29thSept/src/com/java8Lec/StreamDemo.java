package com.java8Lec;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(4,7,9,2,6,5);
		
		numbers.stream().filter(n->n%2==0).map(p->p*p).sorted().forEach(x->System.out.println(x));

		numbers.stream().filter(n->n%2==0).map(p->p*p).sorted().collect(Collectors.toList());
	}

}


//Stream: a pipeline of different operations on a java collection

//Intermediate operation: transform the collection, there can be multiple intermediate operations

//Terminal operation: applied at the end of stream