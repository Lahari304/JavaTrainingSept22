
public class Waiter extends Thread{
	
	Dish d;
	
	Waiter(Dish d){
		
		this.d = d;
		
//		this.start();
	}
	
	public void run() {
		
		try {
			this.d.preparation();
			System.out.println("Dish is being served..");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
