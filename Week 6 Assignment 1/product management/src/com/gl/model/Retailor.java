package com.gl.model;

import java.util.concurrent.BlockingQueue;

public class Retailor implements Runnable{
	private final long id =250;
	private String name;
	private BlockingQueue<Product> inventory;
	public Retailor(String name, BlockingQueue<Product> inventory) {
		super();
		this.name = name;
		this.inventory = inventory;
	}
	
	private Product sellProduct() throws InterruptedException {
		return this.inventory.take();
		
	}

	@Override
	public void run() {
		while(this.inventory.size() <= 10) {
			try {
				Product product1 = sellProduct();
				System.out.println("selling product"+this.name);
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

}
