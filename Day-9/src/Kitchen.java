
public class Kitchen extends Thread{
	
	Dish d;
	Waiter w;
	
	Kitchen(Dish d){
		
		this.d = d;
		this.w = new Waiter(d);
	}
	
	public void run() {
			
			try {
				this.d.preparation();
				System.out.println("Preparing the dish..");
			}
			catch(IllegalMonitorStateException e) {
				e.printStackTrace();
			}
			
			w.start();
	}
	
	
}
