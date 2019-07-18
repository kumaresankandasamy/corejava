package com.gl.client;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.gl.model.Distributor;
import com.gl.model.Product;
import com.gl.model.Retailor;

public class InventortManagementClient {
	public static void main(String[] args) throws Exception {
		System.out.println("Inventory management using occur exception");
		BlockingQueue<Product> inventory = new ArrayBlockingQueue<Product>(10);
		Distributor distributor = new Distributor("Burberry Distributor", inventory);
		Retailor retailor  = new Retailor("Mulberry Harlow Distributor", inventory);
		Thread t1 = new Thread(distributor);
		Thread t2 = new Thread(retailor);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
	}
}
