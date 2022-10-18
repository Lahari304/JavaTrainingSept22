package com.java8.Assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<Student> batch = new ArrayList<Student>();
		
		batch.add(new Student(1, "Lahari", 'A'));
		batch.add(new Student(2, "Robert", 'B'));
		batch.add(new Student(3, "Laena", 'C'));
		batch.add(new Student(4, "Jon", 'C'));
		batch.add(new Student(5, "Luke", 'D'));
		batch.add(new Student(7, "Jace", 'A'));
		batch.add(new Student(8, "Alicent", 'B'));
		batch.add(new Student(9, "Arya", 'C'));
		batch.add(new Student(10, "Bran", 'D'));
		batch.add(new Student(11, "Ned", 'A'));
		batch.add(new Student(12, "Gregor", 'B'));
		batch.add(new Student(13, "Illyrio", 'C'));
		
		batch.stream().filter(s->s.getGrade()=='A').
		sorted((j,k)-> j.getName().compareTo(k.getName())).
				forEach(x-> System.out.println(x.getName()));
	}

}
