
public class Candidate{
	
	String name;
	char gender;
	int expectedSalary;
	
	Candidate(String name, char gender, int expectedSalary) throws InvalidSalaryException{
		
		if(expectedSalary < 10000) { 
			InvalidSalaryException e = new InvalidSalaryException();
			throw e;
		}
		else {
		this.name = name;
		this.gender =  gender;
		this.expectedSalary = expectedSalary;
		}
		
	}
	
	void display() {
		System.out.println("Candidate's details : \nName : "+name+
				"\nGender : "+gender+
				"\nExpected Salary : "+expectedSalary);
	}
}
