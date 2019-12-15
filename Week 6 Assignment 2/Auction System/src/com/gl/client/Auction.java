package com.gl.client;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.gl.model.Bidder;
import com.gl.model.Item;

public class Auction {
	

	private static boolean initial;
	private static Bidder b;
	private Object bid;

	public static void main(String[] args) throws InterruptedException {
		List<Item> item = new LinkedList<>();
		
	    Item item1 = new Item(1, "Swift-Dezire", 5_00_000, "good condition car");
		Item item2 = new Item(1, "Swift-Dezire", 5_00_000, "good condition car");
		Item item3 = new Item(1, "Swift-Dezire", 5_00_000, "good condition car");
		Item item4 = new Item(1, "Swift-Dezire", 5_00_000, "good condition car");
		
		item.add(item1);
		item.add(item2);
		item.add(item3);
		item.add(item4);
		
		Bidder bidder1 = new Bidder(1, "Vinay", null, 1000);
		Bidder bidder2 = new Bidder(2, "Krishna ", null, 2000);
		Bidder bidder3 = new Bidder(3, "Mohan ", null, 3000);
		Bidder bidder4 = new Bidder(4, "Rohan ", null, 4000);
		
		List<Bidder> bidder = new LinkedList<>();
		bidder.add(bidder1);
		bidder.add(bidder2);
		bidder.add(bidder3);
		bidder.add(bidder4);
		
		java.util.Iterator<Item> itItem =  item.iterator();
		CountDownLatch count = new CountDownLatch(6);
		Iterator itBid = (Iterator) bidder.iterator();
		while(((java.util.Iterator<Item>) itItem).hasNext()) {
			Item items = itItem.next();
			System.out.println("Auction start"+items.getId()+"price"+items.getBaseprice());
			
			Thread t1 = new Thread(bidder1);
			Thread t2 = new Thread(bidder2);
			Thread t3 = new Thread(bidder3);
			Thread t4 = new Thread(bidder4);
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			CountDownLatch latch = null;
			latch.await(1000,TimeUnit.SECONDS);
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			while((  (java.util.Iterator<Bidder>) itBid).hasNext()) {
			itBid.next();
			double price = 0;
			if((price < Bidder.getBidPrice()) && (b.getBidPrice() > b.getBidPrice())){
				price = b.getBidPrice();
				System.out.println("Bidder get the items"+b.getName());
			}else {
				System.out.println("Bidder not get the items");
			}
		
			}
				
			}
			
		}
		
	}


