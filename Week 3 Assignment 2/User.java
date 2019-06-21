public class User{
	private int userId;
	private String username;
	private String useraddress;
	private String userContactDetails;
	private Cart cart = new Cart();
	int[] item = new int[10];

	User(int userId,String username,String useraddress,String userContactDetails){
		this.userId = userId;
		this.username = username;
		this.useraddress = useraddress;
		this.userContactDetails = userContactDetails;
	}
	
	public void addItem(int items, int quantity, int seller){
		this.cart.add(items,quantity,seller);
	}
	public void removeItem(int items, int quantity, int seller){
		this.cart.remove(items, quantity, seller);
	}
	public void pay(double amount){

		this.pay(amount);
	}
	public String getusername(){
		return this.username;
	}
	public String getuserAddress(){
		return this.useraddress;
	}
}