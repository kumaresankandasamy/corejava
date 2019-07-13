package com.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Mobiles implements Comparable<Item>{
	List<Item> item = new ArrayList<>();
	int mobileId;
	String mobileName;
	public Mobiles(List<Item> item2) {
		super();
		this.item = item;
		this.item.add((Item) item);
	}
	public Mobiles(String mobile) {
		// TODO Auto-generated constructor stub
		this.mobileName = mobile;
	}
	public List<Item> getItem() {
		return item;
	}
	public void setItem(List<Item> item) {
		this.item = item;
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + mobileId;
		result = prime * result + ((mobileName == null) ? 0 : mobileName.hashCode());
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
		Mobiles other = (Mobiles) obj;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (mobileId != other.mobileId)
			return false;
		if (mobileName == null) {
			if (other.mobileName != null)
				return false;
		} else if (!mobileName.equals(other.mobileName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Mobiles [item=" + item + ", mobileId=" + mobileId + ", mobileName=" + mobileName + "]";
	}
	public int compareTo(Item id) {
		return 0;
	}
	
}
class SmartPhone extends Mobiles{
  
	public SmartPhone(List<Item> item) {
		super(item);
		
	}
	List<Item> item = new ArrayList<>();
	
	
}
