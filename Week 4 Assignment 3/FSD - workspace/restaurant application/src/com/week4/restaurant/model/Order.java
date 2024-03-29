package com.week4.restaurant.model;

public class Order {
	int id;
	String customername;
	Dish dish;
	public Order(int id, String customername, Dish dish) {
		super();
		this.id = id;
		this.customername = customername;
		this.dish = dish;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customername == null) ? 0 : customername.hashCode());
		result = prime * result + ((dish == null) ? 0 : dish.hashCode());
		result = prime * result + id;
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
		Order other = (Order) obj;
		if (customername == null) {
			if (other.customername != null)
				return false;
		} else if (!customername.equals(other.customername))
			return false;
		if (dish == null) {
			if (other.dish != null)
				return false;
		} else if (!dish.equals(other.dish))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", customername=" + customername + ", dish=" + dish + "]";
	}
	public int compare(int id, Dish dish) {
		// TODO Auto-generated method stub
		return this.id;
	}
	
	
}	
	
 
