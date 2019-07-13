package com.ecommerce;

public class Address {
	private int FlatNo;
	private String street;
	private String city;
	private String state;
	private int pincode;
	
	public Address(int flatNo, String street, String city, String state, int pincode) {
		super();
		FlatNo = flatNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

}
