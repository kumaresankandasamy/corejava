public class  sellers{
	private int sellerId;
	private String sellerName;
	private String sellerAddress;
	private String sellerContactdetails;
	private int items;
	private int itemsInitial = 0;

    sellers(int sellerId,String sellerName,String sellerAddress,String sellerContactdetails){
    this.sellerId =sellerId;
    this.sellerName = sellerName;
    this.sellerAddress = sellerAddress;
    this.sellerContactdetails = sellerContactdetails;
    }

    public void sell(){
    	this.items = items;
    }
    public int getItem(){
    	return this.itemsInitial;
    }

}