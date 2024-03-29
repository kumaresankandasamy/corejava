package com.week4.restaurant.model;

public class Dish {
	private int id;
	private String name;
	private Dishtype dishtype;
	private double calories;
	private double price;
	private static int count = 50;
	public Dish(int id, String name, Dishtype dishtype, double calories, double price) {
		super();
		this.id = id;
		this.name = name;
		this.dishtype = dishtype;
		this.calories = calories;
		this.price = price;
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
	public Dishtype getDishtype() {
		return dishtype;
	}
	public void setDishtype(Dishtype dishtype) {
		this.dishtype = dishtype;
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
	@Override
	public String toString() {
		return "Dish [id=" + id + ", name=" + name + ", dishtype=" + dishtype + ", calories=" + calories + ", price="
				+ price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(calories);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((dishtype == null) ? 0 : dishtype.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Dish other = (Dish) obj;
		if (Double.doubleToLongBits(calories) != Double.doubleToLongBits(other.calories))
			return false;
		if (dishtype != other.dishtype)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	


}
