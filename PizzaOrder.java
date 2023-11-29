package AddPizzaAmount;

public class PizzaOrder {
    
	private boolean vegpizza;
	private int price;
	 
	public PizzaOrder(boolean vegpizza) {
	   this.vegpizza = vegpizza;
	   if(this.vegpizza) {
		   System.out.println("Veg Pizza Price = Rs 300");
		   this.price= 300;
	   }
	   else {
		   System.out.println("Non-Veg Pizza Price = Rs 400");
		   this.price=400;
	   }
     }
	
	public void extraCheese() {
		System.out.println("you added extra cheese = Rs 100");
		this.price+=100;
	}
	public void addtoppins() {
		System.out.println("you added extra toopins = Rs 150");
		this.price+=150;
	}
	public void takeAway() {
		System.out.println("Remove takeAway pizza = Rs 30");
		this.price+=30;
	}
	public void getbill() {
		
		System.out.println( "The total amount = Rs " +  this.price);
	}
	public static void main(String[] args) {
		PizzaOrder order = new PizzaOrder(false);
		//order.getprice();
		//order.addtoppins();
		order.extraCheese();
		order.takeAway();
		order.getbill();
		
	}
}