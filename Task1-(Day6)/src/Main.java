import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		boolean loop = true;
		System.out.println("\t\t\t### Welcome to your E-Learning Portal ! ###\n");
		
		Map<Integer, Course> courses = new HashMap<Integer, Course>();
		Map<Integer, Student> students = new HashMap<Integer, Student>();
		
		while(loop) {
			
			System.out.println("\nPlease state your purpose - Enter:\n"
					+ "\tA: if you want to add a new course (OR)\n"
					+ "\tB: if you are a student\n\n"
					+ ":");
			
			char inp = sc.next().charAt(0);
									
			if(inp == 'A') {
				
				System.out.println("Enter course name and name of the instructor");

				courses.put(courses.size()+100, new Course(courses.size()+100, sc.next(), sc.next()));
				
				System.out.println("Successfully created the course : "
				+ courses.get(courses.size()+99).toString());
			}
			else if(inp == 'B') {
				
				System.out.println("Enter A: if you are a new enrollee\n"
						+ "B: if you are already a student and wish to enroll in a new course\n"
						+ "C: if you wish to rate a course");
				
				char opt = sc.next().charAt(0);
				
				switch(opt) {
				
					case 'A':
					{
						System.out.println("Enter your name: ");
						Integer enrollId = (Integer) 202200+students.size();
						students.put(enrollId, new Student(enrollId, sc.next()));
						System.out.println("Congrats you are enrolled!!\nYour enrollement id is: "
								+ students.get(enrollId).getId());
						break;
					}
					
					case 'B':
					{
						System.out.println("Enter you enrollment id: ");
						Integer studId = sc.nextInt();
						
						if(students.get(studId) == null) {
							System.out.println("Student doesn't exist!");
						}
						else {
						System.out.println("Courses available: ");
						
						System.out.println(courses.toString()+"\n");
						
						
						try {
							System.out.println("Enter the course's ID you wish to enroll in : ");
							
							Integer courseId = sc.nextInt();
							
							students.get(studId).enrolledIn.add(courses.get(courseId));
//							courses.get(courseId).students.add(students.get(studId));
						}
						catch(Exception e) {
							System.out.println("Invalid Entry. Try Again.");
						}
						
						break;
						}
					}
				}
			}
			else System.out.println("Invalid Entry. Try Again.");
			
			System.out.println("Do you want to exit? (y/n) ");
			
			if(sc.next().equalsIgnoreCase("y")) loop = false;
			
		}

	}

}


//Create a menu driven java application for an e-learning portal.
//Application should able to add new courses and also create new Students. 
//Students should able to enroll into multiple courses.
//
//User should able to see all the course details.
//
//Also, application should return all students enrolled in a particular course in a sorted manner 
//(sort based on enrollment id).
//
//Make sure to handle exceptions properly.
//
//Add custom exceptions wherever required.