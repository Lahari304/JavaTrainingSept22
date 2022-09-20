package question2;

public class StudentFactory {
	
	public static Student getStudent(String inp) {
		
		if(inp.equalsIgnoreCase("HOSTELLER")) return new Hosteller();
		else if(inp.equalsIgnoreCase("DAYSCHOLAR")) return new DayScholar();
		
		return null;
		
	}

}
