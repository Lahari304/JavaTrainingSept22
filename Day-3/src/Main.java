import java.util.HashMap;
import java.util.Scanner;

import question2.DayScholar;
import question2.Hosteller;
import question2.Student;
import question2.StudentFactory;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("State the manner of employment (Contractual / Permanent) :");
//		
//		String inp = sc.next();
//		
//		if(inp == null) System.out.println("Invalid input! Try again later.");
//		
//		Employee emp = EmployeeFactory.getEmployee(inp);
//		
//		System.out.println("Salary = $"+ emp.netSalary());
//		System.out.println("Loan Limit = $"+ emp.loanLimit());
		
		// SECOND QUESTION
		
//		HashMap<Integer, Student> batch = new HashMap<>();
		
		System.out.println("State your manner of residency(Hosteller/DayScholar) :");
		
		String inp = sc.next();
		
		Student st = StudentFactory.getStudent(inp);
		
		System.out.println("Enter your number to register/retrieve details :");
		
		st.setRegNo(sc.nextInt());
		System.out.println("Department : ");
		st.setDept(sc.next());
		
		if(inp.equalsIgnoreCase("HOSTELLER")) {
			System.out.println("Hostel Number : ");
			st.setHostelNum(sc.nextInt());
			System.out.println("Room Number : ");
			st.setRoomNum(sc.nextInt());
		}
		else if(inp.equalsIgnoreCase("DAYSCHOLAR")) {
			System.out.println("Address : ");
			st.setAddress(sc.next());
			System.out.println("Mode of transport : ");
			st.setModeofTransport(sc.next());
		}
		
		st.printDetails();
		
		
		
		
		
	}

}
