public class Cart{
	public int quantity;
	public int users;
	public int items;
    
    Cart(int quantity,int users,int items){
    	this.quantity = quantity;
    	this.users = users;
    	this.items = items;
    }
    public int getquantity(){
    	return this.quantity;
    }
    public int getUsers(){
    	return this.users;
    }
    public int getItems(){
    	return this.items;
    }
}
class Checkout extends Cart{
	private int NumberofItems;
    private String username;
    private double price;
    private double total;
    private Cart cart = new Cart();

  public  Checkout(String username,double price,double total){
    	this.username = username;
    	this.price = price;
    	this.total = total;
    }

    public void checkoutCarts(Cart ...cart){
    	for(int i=0;i<cart.length;i++){
    		if(cart[i].getItem() instanceof Mobiles){
    			Mobiles mobile = (mobile)cart[i].getItems();
    			User user = (user)cart[i].getUsers();
    			this.name = getusername(user);
    			this.NumberofItems = cart[i].getquantity();
    			this.price = price;
    			calctotal();

    		}
    		else if(cart[i].getItems() instanceof Fashions){
    			Fashions fashion = (Fashions)carts[i].getItems();
    			User user = (user)carts[i].getUsers();
    			this.name = getusername(user);
    			this.NumberofItems = cart[i].getquantity();
    			this.price = price;
    			calctotal();

    		}
    	}
    }
private String getusername(User user){
	return this.username;
}
private double getItemsprice(Mobiles mobile){
	return this.price;
}
private double getItemsprice(Fashions fashion){
	return this.price;
}
private double calctotal(){
	total += (NumberofItems * price);
}
public double gettotal(){
	return this.total;
}
}
interface PaymentGateway{
	public abstract void payDebit();
	public abstract void payCredit();
	public abstract void payNetbanking();
	public abstract void payWallet();

}
class Payment extends Checkout implements PaymentGateway{
	private int order;
	private double price;
    
    public Payment(double price){
    	this.price = price;
    }
    @Override
    public void payDebit(){
    	System.out.println("pay with debitcard"+this.price);
    }
    @Override
    public void payCredit(){
    	System.out.println("pay with creditcard"+this.price);
    }
    @Override
    public void payNetbanking(){
    	System.out.println("pay with netbanking"+this.price);
    }
    @Override
    public void payWallet(){
    	System.out.println("pay with wallet"+this.price);
    }
}