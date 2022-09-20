import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("State the manner of employment (Contractual / Permanent) :");
		
		String inp = sc.next();
		
		if(inp == null) System.out.println("Invalid input! Try again later.");
		
		Employee emp = EmployeeFactory.getEmployee(inp);
		
		System.out.println("Salary = $"+ emp.netSalary());
		System.out.println("Loan Limit = $"+ emp.loanLimit());
		
	}

}
