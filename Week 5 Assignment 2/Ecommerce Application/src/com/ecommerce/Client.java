package com.ecommerce;

public class Client {
	public static void main(String[] args) {
		Mobiles mobile = new Mobiles("jio");
		Cart cart = new Cart(1, 1, 1, null, null, args);
		User user = new User(null, 0, null);
		double price = 0;
		payment(price);
	}

	private static void payment(double price) {
		// TODO Auto-generated method stub
		
	}

}
