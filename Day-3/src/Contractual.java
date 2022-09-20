
public class Contractual implements Employee{
	
	public double basicSalary() {
		return 16000;
	}
	
	public double pfAmount() {
		return 0.12 * basicSalary();
	}
	
	public double netSalary() {
		return basicSalary() - pfAmount();
	}
	
	public double loanLimit() {
		return 0.10 * netSalary();
	}
}
