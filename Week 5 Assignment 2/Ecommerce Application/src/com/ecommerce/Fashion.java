package com.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Fashion implements Comparable<Item>{

	@Override
	public int compareTo(Item arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	List<Item> item = new ArrayList<>();
	private int fahionId = 50;
	
	@Override
	public String toString() {
		return "Fashion [item=" + item + ", fahionId=" + fahionId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fahionId;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
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
		Fashion other = (Fashion) obj;
		if (fahionId != other.fahionId)
			return false;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		return true;
	}
	public int getFahionId() {
		return fahionId;
	}
	public void setFahionId(int fahionId) {
		this.fahionId = fahionId;
	}
	public Fashion(List<Item> item, int fahionId) {
		super();
		this.item = item;
		this.fahionId = fahionId;
	}
	public Fashion(List<Item> item) {
		super();
		
		this.item = item;
		this.item.add((Item) item);
	}
	public List<Item> getItem() {
		return item;
	}
	public void setItem(List<Item> item) {
		this.item = item;
	}
	
	public int compareTo1(Item id) {
		return this.fahionId;
	}

}
class Shirt extends Fashion{
	List<Item> item = new ArrayList<>();

	public Shirt(List<Item> item) {
		super(item);
		
	}
	
}
