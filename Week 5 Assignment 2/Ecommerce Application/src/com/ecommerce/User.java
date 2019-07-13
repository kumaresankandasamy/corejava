package com.ecommerce;

public class User {
	private static int userId =1;
	private String userName;
	private long contactDetails;
	private Address address;
	private Cart cart = new Cart();
	private int count;
	public User(String userName, long contactDetails, Address address) {
		super();
		this.userName = userName;
		this.contactDetails = contactDetails;
		this.address = address;
		this.count = 100;
	}
	public void addItem(Item item,int quantity,Seller seller) {
		this.cart.addToCart(item,quantity,seller);
	}
	public void removeItem(Item item, int quantity, Seller seller){
		this.cart.removeFromCart(item, quantity, seller, quantity);
	}
	public void userInfo() {
		System.out.println("user name :"+this.userName+ "\n user id :"+this.userId);
		
	}
	public static double payment(double price) {
		return payment(price);
	}

}
