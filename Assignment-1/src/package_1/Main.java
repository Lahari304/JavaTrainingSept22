package package_1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("......");
		
		Scanner sc = new Scanner(System.in);
		
		// FIRST QUESTION
		
//		Student [] s = new Student[5];
//		
//		String name;
//		int age, rollNo, marks;
//			
//			for(int i=0; i<s.length; i++) {
//				name = sc.next();
//				age = sc.nextInt();
//				rollNo = sc.nextInt();
//				marks = sc.nextInt();
//				
//				if(marks < 30) System.out.println("**Marks less than 30 cannot be accepted**");
//				else s[i] = new Student(name, age, rollNo, marks);
//			}
//			
		
		//SECOND QUESTION
		
//		String str = "rainy days are the best";
//		String [] tokens = str.split(" ");
//		
//		str = "";
//		
//		for(int i=0; i<tokens.length; i++) {
//			str +=( (char) (tokens[i].charAt(0)-'a'+'A') )+ tokens[i].substring(1) + " ";
//		}
//		
//		System.out.println(str);
	
	
	//THIRD QUESTION
	
	Employee [] emp = new Employee[5];
	
	emp[0] = new Employee(1, 4);
	emp[1] = new Employee(2, 7);
	emp[2] = new Employee(3, 2);
	emp[3] = new Employee(4, 1);
	emp[4] = new Employee(5, 3);
	
	for(int i=0; i<emp.length-1; i++) {
		for(int j=0; j<emp.length-1; j++) {
			if(emp[j].exp > emp[j+1].exp) {
				Employee temp = emp[j];
				emp[j] = emp[j+1];
				emp[j+1] = temp;
			}
		}
	}
	
	for(int i=0; i<emp.length; i++) {
		System.out.println(emp[i].exp);
	}
	

	}
	
}
