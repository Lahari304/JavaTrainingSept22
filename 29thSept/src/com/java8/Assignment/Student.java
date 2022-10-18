package com.java8.Assignment;

import java.util.Comparator;

public class Student{
	
	int id;
	String name;
	char grade;

	public Student(int id, String name, char grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

//	@Override
//	public int compare(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		return o1.getName().compareTo(o2.getName());
//	}
	
	

}
