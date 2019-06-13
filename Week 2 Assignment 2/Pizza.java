public class Pizza{
	private String crust;
	private String toppings;
	private String sides;
	private int offers;
	private double discount;
	private double cost;

	public Pizza(String crust,String toppings,String sides,int offers){
    crust = this.crust;
    toppings = this.toppings;
    sides = this.sides;
    offers = this.offers;
	}
	public double Totalcost(){
		return cost;
	}
public static void main(String[] args) {
	Pizza piz = new Pizza(" Thin Crust"," Corn"," Coke",20);
	System.out.println("Totalcost: "+piz.Totalcost());
	}
}