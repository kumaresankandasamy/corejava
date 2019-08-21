public class Client{
	public static void main(String[] args) {
		Mobiles asus = new Mobiles(1,"Asus zenfone","newtech",13000);
		Fashions shirt = new Fashions(1,"lee","medium ",700);
		User user = new User(14,"Rajprakash","US","westernpark");
		Sellers seller = new Sellers(12,"Ram","US","southernpark");
	    Cart cart = new Cart(1,1,4);
	    Checkout check = new Checkout();
	    check.checkoutCarts(cart);
	    Payment pay = new Payment(check);
	    pay.payDebit();
         
	}
}