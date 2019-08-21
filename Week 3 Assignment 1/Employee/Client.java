public class Client{
	public static void main(String[] args) {

		for (int index = 0; index < args.length; index ++){
            System.out.println(" args ["+index+"]: "+args[index]);
        }

		RegularEmployee obj = new RegularEmployee();
		ContractEmployee obj1 = new ContractEmployee();
		obj.display();
		obj.applyForVacation(5);
		obj1.calcPay();
		obj1.display();
		obj1.applyForVacation(0);
	}
}