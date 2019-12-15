package com.ecommerce;

import java.util.HashSet;
import java.util.Set;

public class Cart {
	private static final int Item = 0;
	private static final int Set = 0;
	private int quantiy;
	private int noOfitem;
	private int count = 0;
	Set<Item> item = new HashSet<>();
	private Seller seller;
	private Object[] quantity;
	
	

	public Cart(int quantiy, int noOfitem, int count, java.util.Set<com.ecommerce.Item> item, Seller seller,
			Object[] quantity) {
		super();
		this.quantiy = quantiy;
		this.noOfitem = noOfitem;
		this.count = count;
		this.item = item;
		this.seller = seller;
		this.quantity = quantity;
	}

	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public void addToCart(Item item, int quantity, Seller seller) {
		// TODO Auto-generated method stub
		this.item.add(item);
		this.quantiy = quantity;
		this.seller = seller;
		if(count >=quantity) {
			count += quantity;
		}
		else {
			System.out.println(this.count);
		}
		
	}

	public void removeFromCart(Item item, int quantity, Seller seller, int index) {
		// TODO Auto-generated method stub
		for(int i=0;i<item.lenght;i++) {
			String itemId = null;
			if(itemId == item.itemName) {
				if(this.quantiy >= quantity) {
					this.noOfitem = this.noOfitem - quantity;
				    int count = seller.getCount();
				    count = count + noOfitem;
				    this.setCount(count);
				    }
				else {
					System.out.println("item unavailable :");
				}
				
			}
			
		}
	}

	private void setCount(int count2) {
		// TODO Auto-generated method stub
		this.count = count2;
		
	}
	public void display() {
		System.out.println("print carts items"+this.noOfitem);
	}

	

}
