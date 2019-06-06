public class Age{
	public static void main(String[] args) {
		int age = 45;
		if(age < 2){
			System.out.println("Infant");

		}
		else if(age > 2 && age < 12){
			System.out.println("child");

		}
		else if(age > 12 && age < 20){
			System.out.println("Teenager");
		}
		else if(age > 19 && age < 58){
			System.out.println("Adult");
		}
		else {
			System.out.println("Senoir Citizen");
		}
	}
}