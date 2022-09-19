import java.util.Scanner;

public class Main {
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		String inp = sc.next();
		
		Sport s = implSport.getSport(inp);
		
		System.out.println("Number of players = "+ s.players ()+
							"\nType of ground = "+ s.ground());
		
	}

}
