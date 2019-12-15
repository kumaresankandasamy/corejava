package com.gl.model;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Bidder implements Comparable<Bidder>,Serializable,Runnable {
	private long id;
	private String name;
	private CountDownLatch countDownLatch;
	private static double bidPrice;
	private int lock;
	Scanner sc = new Scanner(System.in);
	public Bidder(long id, String name, CountDownLatch countDownLatch, int lock) {
		super();
		this.id = id;
		this.name = name;
		this.countDownLatch = countDownLatch;
		this.lock = lock;
	}
	
	public Bidder(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CountDownLatch getCountDownLatch() {
		return countDownLatch;
	}
	public void setCountDownLatch(CountDownLatch countDownLatch) {
		this.countDownLatch = countDownLatch;
	}
	public static double getBidPrice() {
		return bidPrice;
	}
	public void setBidPrice(double bidPrice) {
		this.bidPrice = bidPrice;
	}
	public int getLock() {
		return lock;
	}
	public void setLock(int lock) {
		this.lock = lock;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(bidPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((countDownLatch == null) ? 0 : countDownLatch.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + lock;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bidder other = (Bidder) obj;
		if (Double.doubleToLongBits(bidPrice) != Double.doubleToLongBits(other.bidPrice))
			return false;
		if (countDownLatch == null) {
			if (other.countDownLatch != null)
				return false;
		} else if (!countDownLatch.equals(other.countDownLatch))
			return false;
		if (id != other.id)
			return false;
		if (lock != other.lock)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Bidder [id=" + id + ", name=" + name + ", countDownLatch=" + countDownLatch + ", bidPrice=" + bidPrice
				+ ", lock=" + lock + "]";
	}
	public int compareTo(Bidder bidder) {
		return this.name.compareTo(bidder.getName());
		
	}

	@Override
	public void run() {
		
		try {
			Thread.sleep(this.lock);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Auction start"+this.id+"Bidder"+this.name);
		double bidPrice = sc.nextDouble();
		this.setBidPrice(bidPrice);
		
		this.setCountDownLatch(countDownLatch);
		this.countDownLatch.countDown();
	}

}
