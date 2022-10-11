
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ordering the dish..");
		
		Dish d = new Dish();
		
		Order order = new Order(d);
		
		

	}

}

//Mimic a restaurant scenario using inter thread communication where waiter is waiting for the dish to be 
//prepared...once the dish is ready to serve, waiter will get notified until then the waiter will keep getting a 
//message that "preparing the dish"