public class PizzaStore{
	private String crust;
	private String toppings;
	private String sides;
	private int price;
	private double discount;
	public String offers;

	public PizzaStore(String crust,String toppings,String sides,String offers){
		crust = this.crust;
		toppings = this.toppings;
		sides = this.sides;
		offers = this.offers;

	}
	public static int crustPrice(String crust){
		int price;
		if(crust == "Thin Crust"){
			price = 100;
		}
		else if(crust == " Cheese Burst"){
			price = 200;
		}
		else if(crust == "Classic Pan"){
			price = 300;
		}
		else{
			price = 0;
		}
		return price;
    }
	public  static int toppingsPrice(String toppings){
		int price;
		if(toppings == "Corn"){
			price = 50;
		}
		else if(toppings == " Chicken"){
			price = 100;
		}
		else if(toppings == "Paneer"){
			price = 150;
		}
		else if(toppings == "Pineapple"){
			price = 150;
		}
		else if(toppings == "Pepperoni"){
			price = 200;
		}
		else{
			price = 0;
		}
		return price;
	}
	public static int sidesPrice(String sides){
		int price;
		if(sides == "Coke"){
			price = 50;

		}
		else if(sides == "Fries"){
			price = 100;
		}
		else if(sides == "Wedges"){
			price = 150;
		}
		else if(sides == "Nachos"){
			price = 200;
		}else{
			price= 0;
		}
		
		return price;
	}
	public int totalPrice(String offers){
	int crustTotal	= PizzaStore.crustPrice(crust);
	int toppingTotal	= PizzaStore.toppingsPrice(toppings);
	int sidesTotal	= PizzaStore.sidesPrice(sides);
	
	int total = crustTotal  + sidesTotal + toppingTotal;
	if(offers == "20 OFF"){
		total = total * 20 / 100;
	}
	else if(offers == "50 OFF"){
		total = total * 50 / 100;
	}
	
	return total;
    }
    

}