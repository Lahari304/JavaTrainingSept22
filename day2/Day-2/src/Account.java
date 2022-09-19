
public class Account {
	
	int pr;
	double rate;
	int months;
	
	public double interest() {
		return pr*months*rate;
	}
}
