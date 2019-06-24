public class Client{
	public static void main(String[] args) {
		GoodsVehicle goodsvehicle = new GoodsVehicle("KA 02 2012","2012","Riz","Black");
		PassengerVehicle passengervehicle = new PassengerVehicle("KA 03 2013","2012","Riz","Black=blue");
		LuxuryVehicle luxeryvehicle = new LuxuryVehicle("KA 04 2012","2014","Riz","Black-orange");
		RacingVehicle racingvehicle = new RacingVehicle("KA 05 2012","2015","Riz","red");

		goodsvehicle.booking(1);
		passengervehicle.booking(4);
		luxeryvehicle.booking(2);
		racingvehicle.booking(1);

	}
}