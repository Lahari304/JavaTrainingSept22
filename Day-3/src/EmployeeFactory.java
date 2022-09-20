
public class EmployeeFactory {
	
	public static Employee getEmployee(String inp) {
		
		if(inp.equalsIgnoreCase("Contractual")) return new Contractual();
		
		else if(inp.equalsIgnoreCase("Permanent")) return new Permanent();
		
		return null;
	}

}
