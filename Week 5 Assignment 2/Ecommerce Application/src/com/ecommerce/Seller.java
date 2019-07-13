package com.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Seller {
	private int sellerId = 5;
	
	protected String sellerName;
	protected long contactDetails;
	protected Address address;
	protected int count;
	public Seller(String sellerName, long contactDetails, Address address) {
		super();
		this.sellerName = sellerName;
		this.contactDetails = contactDetails;
		this.address = address;
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

}
class Reliance extends Seller{
List<Item> reliance = new ArrayList<Item>();
int relianceCount;
	public Reliance(String sellerName, long contactDetails, Address address) {
		super(sellerName, contactDetails, address);
		// TODO Auto-generated constructor stub
		this.sellerName = sellerName;
		this.contactDetails = contactDetails;
		this.address = address;
		Item item = null;
		reliance.add(item);
		this.relianceCount += count;
	}
	public List<Item> getReliance() {
		return reliance;
	}
	public void setReliance(List<Item> reliance) {
		this.reliance = reliance;
	}
	public int getRelianceCount() {
		return relianceCount;
	}
	public void setRelianceCount(int relianceCount) {
		this.relianceCount = relianceCount;
	}
	@Override
	public String toString() {
		return "Reliance [reliance=" + reliance + ", relianceCount=" + relianceCount + "]";
	}
	
}