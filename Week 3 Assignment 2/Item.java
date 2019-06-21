import java.util.*;
public abstract class Item{
	public int itemId;
	public String itemName;
	public String itemdesc;
	public double itemprice;
	public Item(int itemId,String itemName,String itemdesc,double itemprice){
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemdesc = itemdesc;
		this.itemprice = itemprice;

	}
	public abstract double getPrice();
	public abstract int getItem();
}
class Mobiles extends Item{
	Mobiles(int itemId,String itemName,String itemdesc,double itemprice){
		super(itemId,itemName,itemdesc,itemprice);
	}

	@Override
	public double getPrice(){
		return this.itemprice;
	}
	@Override
	public int getItem(){
		return this.itemId;
	}
}
class Fashions extends Item{
	Fashions(int itemId,String itemName,String itemdesc,double itemprice){
		super(itemId,itemName,itemdesc,itemprice);
	}

	@Override
	public double getPrice(){
		return this.itemprice;
	}
	@Override
	public int getItem(){
		return this.itemId;
	}

}
