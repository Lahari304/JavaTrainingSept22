package package_1;

public class Student {
	
	String name;
	int age, rollNo, marks;
	
	Student(String name, int age, int rollNo, int marks){
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
		this.marks = marks;
		
		System.out.println("Student object created.");
	}

}