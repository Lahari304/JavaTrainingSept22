
public class Dish{
	
	public synchronized void preparation() {
		
		try {
			this.wait(3000);
			System.out.println("Preparing..");
			this.notify();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
