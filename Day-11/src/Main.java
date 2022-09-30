import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, String> cart = new HashMap<String, String>();
		
		System.out.println("Welcome to your shopping cart!");
		
		boolean go_On = true;
		
		while(go_On) {
		
			System.out.println("Select an action:\n"
					+ "a: Add items to cart\n"
					+ "b: Remove items\n"
					+ "c: View total amount\n"
					+ "d: View category-wise amount");
			
			char c = sc.next().charAt(0);
			
			switch(c) {
			
			case 'a':{
				Category.add(cart);
				break;
			}
			case 'b':{
				Category.remove(cart);
				break;
			}
			}
			
			System.out.println("Exit? (y/n)");
			char inp = sc.next().charAt(0);
			if(inp == 'y') go_On = false;
			
		}
	}

}

//Mimic a shopping cart using HashMap where user can add articles of different category like- grocery, 
//electronics, kids items etc. User should able to remove items also from the cart. 
//User should able to see the total amount for the cart items and category wise amount as well.
