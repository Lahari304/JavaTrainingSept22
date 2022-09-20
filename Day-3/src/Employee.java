
public interface Employee {
	
	double basicSalary();  // total Salary
	double pfAmount(); 	// 12% of basicSalary
	
	double netSalary(); 		// net pay (basic - pf)
	double loanLimit(); 	// 15% of net pay
}
