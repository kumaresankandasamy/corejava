public class SavingsAccount{
	private String customerName;
	private int customerAge;
	private double bankBalance;
	private String nomineeName;
	private long panNumber;
	private boolean deposit = false;
	private boolean withdraw = false;

public SavingsAccount(){
	bankBalance = 0;
}
public SavingsAccount(String customerName,double amount,long panNumber){
	customerName = this.customerName;
	amount  = this.bankBalance;
	panNumber    = this.panNumber;
}
public double checkBalance(){
	return bankBalance;
}
public void updatenomineeDetails(String name){
	nomineeName = name;
}
public void withdraw(String withdrawing){
	double amount=0;
	if(withdrawing.equals("ATM") || withdrawing.equals("withdrawSlip")){
		withdraw = true;
	}
	else if(withdraw){
		bankBalance = bankBalance - amount;
	}

	
}
public void deposit(String depositing){
	double amount=0;
	if(depositing.equals("ATM") || depositing.equals("fillingChallan")){
		deposit = true;
	}
	else if(deposit){
		bankBalance = bankBalance + amount;
	}

}
public static void main(String[] args) {
	SavingsAccount account = new SavingsAccount("ram",0,12345678);
	System.out.println(account.checkBalance());

}
}