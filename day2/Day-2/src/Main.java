
public class Main {
	
	public static void main(String []args) {
		
		Account first = new SavingsAccount(1000, 4);
		Account sec = new CheckingAccount(2500, 7);
		
		System.out.println("first = "+first.interest()+"\nsecond = "+sec.interest());
	}

}
