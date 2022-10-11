
public class Order {
	
	Kitchen k;
	
	Order(Dish d){
		
		this.k = new Kitchen(d);
		k.start();
	}
}
