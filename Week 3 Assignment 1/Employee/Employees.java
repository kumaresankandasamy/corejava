import java.util.*;

public abstract class Employees{
	int id;
	String name;
	int age;
	String[] skills;
	

	Scanner sc = new Scanner(System.in);
	Employees(){
		System.out.println("Enter the name of the employee:");
		name = sc.nextLine();
		System.out.println("Enter age:");
		age = sc.nextInt();
	}
	void display(){
		System.out.println("Employee name :"+name);
		System.out.println("Age : "+age);
	}
}
class RegularEmployee extends Employees{
	float salary;
	int bonus;
	int VacationDays = 20;

	RegularEmployee(){
		System.out.println("enter salary:");
		salary = sc.nextFloat();
	}
	

	void applyForVacation(int noOfDays){
    	int vacationDays = 20;
    	
        if ( vacationDays > noOfDays ){
            vacationDays =  vacationDays - noOfDays;
            System.out.println("Leave applied successfully : Current leave balance :"+vacationDays);
        }
       System.out.println("You do not have sufficient leave balance: Available leaves :"+vacationDays);
       
    }

    void display(){
		super.display();
		System.out.println("salary: "+salary);
	}
}
class ContractEmployee extends Employees{
	int contractDuration = 60;
	int workinghrs,rate;
	ContractEmployee(){
		System.out.println("Enter number of hours working :");
        workinghrs = sc.nextInt();
	}
	void calcPay(){
		rate = 8 * workinghrs;
	}

	void applyForVacation(int noOfDays){
    	int contractDuration = 60;
    	
        if ( contractDuration > noOfDays ){
            contractDuration =  contractDuration - noOfDays;
            
            System.out.println("Leave applied successfully : Contract duration :"+contractDuration);
        }
       System.out.println("You do not have sufficient leave balance: your contract Duration :"+contractDuration);
       contractDuration++;
    }



	void display(){
		super.display();
		System.out.println("Number of working hours :"+workinghrs);
		System.out.println("salary for "+workinghrs+"working hour is: $"+rate);
	}
}
 