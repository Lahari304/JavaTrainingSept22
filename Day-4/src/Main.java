import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] details = new int [n];
//		Exception e;
		
		for(int i=0; i<details.length; i++) {
			
			try{
				details[i] = Integer.parseInt(sc.next());
			}
			catch(NumberFormatException nfe) {
				System.out.println("Enter valid integer input.");
			}
		}
		
		System.out.println("Enter the index of price to be displayed : ");
		
		try {
			int inp = sc.nextInt();
			
			System.out.println("The price is : "+ details[inp]);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Try again later with a valid index.");
		}

	}

}
