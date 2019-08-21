import java.util.*;
public abstract class Vehicle{
	private String vehicleRegNumber;
	public String make;
	public String model;
	public String color;


	public Vehicle(String vehicleRegNumber,String make,String model,String color){
		this.vehicleRegNumber = vehicleRegNumber;
		this.make = make;
		this.model = model;
		this.color = color;
	}
}
class GoodsVehicle extends Vehicle{
	public GoodsVehicle(String vehicleRegNumber,String make,String model,String color){
		super(vehicleRegNumber,make,model,color);
	}
	public void booking(int count){
		Goods good = new Goods(count);
		System.out.println("transport vehicle booked successfully");
	}
}
class Goods{
	int count;
	public Goods(int count){
		this.count = count;
	}
}
class PassengerVehicle extends Vehicle{
	public PassengerVehicle(String vehicleRegNumber,String make,String model,String color){
		super(vehicleRegNumber,make,model,color);
	}
	public void booking(int peopleCount){
		Passenger passenger = new Passenger(peopleCount);
		if(peopleCount >= passenger.minCount){
			System.out.println("transport vehicle booked successfully");
		}else{
			System.out.println("Passenger vehicles can carry more than 4 people");
		}
	}
}
class Passenger{
	int minCount = 4;
	int count;
	public Passenger(int count){
		this.count = count;
	}
}
class LuxuryVehicle extends Vehicle{
	public LuxuryVehicle(String vehicleRegNumber,String make,String model,String color){

		super(vehicleRegNumber,make,model,color);
	}
	public void booking(int peopleCount){
		LuxuryPassenger luxpassenger = new LuxuryPassenger(peopleCount);
		if(peopleCount <= luxpassenger.maxCount){
			System.out.println("transport vehicle booked successfully");
		}else{
			System.out.println("Luxury vehicles can only carry two people");
		}

	}

}
class LuxuryPassenger{
	int peopleCount;
	int maxCount = 2;
	public LuxuryPassenger(int peopleCount){
		this.peopleCount = peopleCount;
	}
}
class RacingVehicle extends Vehicle{
	public RacingVehicle(String vehicleRegNumber,String make,String model,String color){

		super(vehicleRegNumber,make,model,color);
	}
	public void booking(int peopleCount){
		RacingPassenger racpassenger = new RacingPassenger(peopleCount);
		if(peopleCount >= racpassenger.maxCount){
			System.out.println("transport vehicle booked successfully");

		}else{
			System.out.println("vehicles can carry only one passenger");
		}
	}
	
}
class RacingPassenger{
	int maxCount = 1;
	int peopleCount;
	public RacingPassenger(int peopleCount){
		this.peopleCount = peopleCount;
	}
}