public class Clientdrive{
	public static void main(String[] args) {
		Vehicles vehicle1 = new Vehicles("Bangalore","Delhi");
		Vehicles vehicle2 = new Vehicles("Delhi","Bangalore");
		vehicle1.drive(1);
		vehicle2.drive(2);

	}
}