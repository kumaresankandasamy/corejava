package com.gl.model;

import java.util.concurrent.BlockingQueue;

public class Distributor implements Runnable{
	private final long id = 200;
	private String name;
	private BlockingQueue<Product> inventory;
	public Distributor(String name, BlockingQueue<Product> inventory) {
		super();
		this.name = name;
		this.inventory = inventory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BlockingQueue<Product> getInventory() {
		return inventory;
	}
	public void setInventory(BlockingQueue<Product> inventory) {
		this.inventory = inventory;
	}
	public long getId() {
		return id;
	}
	
	private Product updateInventory() {
		return new Product("Bag",200.00,"College Bag");
		
	}
	@Override
	public void run() {
		
		while(this.inventory.size() <= 10) {
		Product product1 = updateInventory();
		try {
			this.inventory.put(product1);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("added new product"+this.getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		if(this.inventory.size() == 10) {
			System.out.println("Inventory full, add any more products till the Retails sells the product");
		}
		}
		
	}
	
	
}
