class Address{
	private int flatNo;
	private String street;
	private String city;
	private String state;
	private int pincode;

	public Address(String street,String city,String state,int flatNo,int pincode){
		this.street = street;
		this.city = city;
		this.state = state;
		this.flatNo = flatNo;
		this.pincode = pincode;

	}
	public void updateCity(){
		this.city = city;
	}

}