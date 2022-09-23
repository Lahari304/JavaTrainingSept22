import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the phonebook simulator!");
		
		Map<String, Integer> contacts = new HashMap<String, Integer>();
		
		boolean loop = true;
		
		while(loop) {
			
			System.out.println("Enter a: to add a new contact\n"
					+ "b: to display all contacts\n"
					+ "c: to search for a contact\n"
					+ "d: to remove a contact");
			
			char inp = sc.next().charAt(0);
			
			switch(inp) {
			
			case 'a':
			{
				System.out.println("Enter name AND number of the contact");
				contacts.put(sc.next(), (Integer) sc.nextInt());
				System.out.println("Contact added successfully");
				break;
			}
			case 'b':
			{
				System.out.println(contacts.toString());
				break;
			}
			case 'c':
			{
				//search by name
				System.out.println("Enter name of the contact");
				String name = sc.next();
				if(contacts.get(name) == null) {
					System.out.println("Contact doesn't exist");
				}
				else {
					System.out.println(contacts.get(name));
				}
				break;
			}
			case 'd':
			{
				System.out.println("Enter name of the contact");
				String name = sc.next();
				if(contacts.get(name) == null) {
					System.out.println("Contact doesn't exist");
				}
				else {
					contacts.remove(name);
					System.out.println("Contact removed successfully");
				}
				break;
			}
			default:
				System.out.println("Invalid input. Try again.");
			}
			
			System.out.println("Exit? (y/n)");
			
			if(sc.next().equalsIgnoreCase("y")) loop = false;
			
		}

	}

}


//Create a phonebook simulator using Core JAVA wherein you can add contacts, display all contacts, 
//search for a particular contact and remove a contact.
//
//Make sure to handle exceptions wherever required.