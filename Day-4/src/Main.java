import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//FIRST QUESTION
		
//		System.out.println("Enter the number of items : ");
//		int n = sc.nextInt();
//		
//		int [] details = new int [n];
//		
//		System.out.println("Enter the price details : ");
//		
//		for(int i=0; i<details.length; i++) {
//			
//			try{
//				details[i] = Integer.parseInt(sc.next());
//			}
//			catch(NumberFormatException nfe) {
//				i--;
//				System.out.println("Enter valid integer input.");
//			}
//		}
//		
//		System.out.println("Enter the index of price to be displayed : ");
//		
//		try {
//			int inp = sc.nextInt();
//			
//			System.out.println("The price is : "+ details[inp]);
//		}
//		catch(ArrayIndexOutOfBoundsException ae) {
//			System.out.println("Try again later with a valid index.");
//		}
		
		//SECOND QUESTION
		
		Candidate cand;
		
		String name;
		char gender;
		int salary;
				
		try {
			
			System.out.println("Enter the name, gender(M/F), and Expected salary of the candidate : ");

			name = sc.next();
			gender = sc.next().charAt(0);
			salary = sc.nextInt();
			
			cand = new Candidate(name, gender, salary);
		}
		catch(InvalidSalaryException e) {
			
			e.statement();
		}
		
	}

}


//1. write a java program to enter price details of multiple items, number of items will be entered by the user. 
//All the price details should be in integer only, if user enters any String or other type, application should 
//handle that exception. Also application should return price detail of any specific index entered by the user. 
//		If the index is out of array bound, it should handle that exception too.
//		
//		2. Create a Candidate class with 3 fields: name. gender and expectedSalary. 
//		While creating the object of Candidate if the expected salary is less than 10000, 
//		it should throw InvalidSalaryException with a message that "Salary cannot be less than 10000" and if 
//		the expected salary is more than 10000 it should create the Candidate object and display the details.
