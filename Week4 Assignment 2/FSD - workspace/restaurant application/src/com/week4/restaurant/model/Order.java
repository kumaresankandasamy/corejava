package com.week4.restaurant.model;

public class Order {
	int id;
	String name;
	enum dishType{
		Veg,
		Non_Veg
	}
	double calories;
	
	double price;
	int status;
	int quantity;  
	public Order(int id, String name, double calories, double price, int status, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.status = status;
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCalories() {
		return calories;
	}
	public void setCalories(double calories) {
		this.calories = calories;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
