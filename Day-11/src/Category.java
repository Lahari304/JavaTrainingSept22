import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Category {
	
	Scanner sc = new Scanner(System.in);
	
    HashMap<String, Integer> grocery;{
	
	this.grocery.put("Vegetables", 10);
	this.grocery.put("Fruits", 20);
	this.grocery.put("Masala powders", 35);
	this.grocery.put("Cooking oils", 46);
	this.grocery.put("Grains", 30);
	this.grocery.put("Pulses", 25);}
	
	Map<String, Integer> electronics;{
	
	this.grocery.put("Mobiles", 10);
	this.grocery.put("Laptops", 20);
	this.grocery.put("Cables", 35);
	this.grocery.put("Power Banks", 46);
	this.grocery.put("PenDrive", 30);
	this.grocery.put("Headphones", 25);
	}
	
	Map<String, Integer> kidsSection;{
		
		this.grocery.put("Clothes", 10);
		this.grocery.put("Footwear", 20);
		this.grocery.put("Art Supplies", 35);
		this.grocery.put("School Supplies", 46);
		this.grocery.put("Toys", 30);
		this.grocery.put("Music Instruments", 25);
		}
	
	static void add(Map<String, String> cart) {
		System.out.println(toString());
		System.out.println("Enter category and item name: ");
		String cat = sc.next(), item = sc.next();
		
		cart.put(cat, item);
		
		return;
	}
	
	static boolean remove(Map<String, String> cart) {
		System.out.println("Enter category and item name to remove:");
		
		String cat = sc.next(), item = sc.next();
		
		cart.remove(cat, item);
		
		return true;
	}

	
	
	

}

	
	public static String toString() {
		return "Category [grocery=" + grocery + ", electronics=" + electronics + ", kidsSection="
				+ kidsSection + "]";
	}
