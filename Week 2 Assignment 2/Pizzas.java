public class Pizzas{
public static void main(String[] args) {
    	PizzaStore pizza = new PizzaStore("Thin Crust","Paneer","Wedges"," ");
    	int Total = pizza.totalPrice(pizza.offers);
    	System.out.println("Total price: "+Total);
		
	}
}