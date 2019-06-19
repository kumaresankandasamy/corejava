public abstract class BankAccount{
	public String accountHoldername;
	public int accountNumber;
	public String accountCreationDate;
	public String branchName;
	protected double balance;
	public Address address;
	protected double minBalance;
	protected double maxDepositBalance;
	protected double interest;
	
   /* public BankAccount(String accountHoldername,int accountNumber){
		this.accountHoldername = accountHoldername;
		this.accountNumber = accountNumber;
	} */

	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	abstract void updateNomineeDetails(String branchName, Address address);

	public double calcInterest(){
		return (this.balance * this.interest)/100;
	}
}
class SavingsAccount extends BankAccount{

	protected int withdrawCount = 0;

	public SavingsAccount(String accountHoldername,int accountNumber,double minBalance,double maxDepositBalance,int interest){
		this.accountHoldername = accountHoldername;
		this.accountNumber = accountNumber;
		this.minBalance = 10000;
		this.maxDepositBalance =50000;
		this.interest = 2;
	}
	@Override
	void updateNomineeDetails(String branchName, Address address) {
		this.branchName = branchName;
		this.address = address;
	}

@Override
public void deposit(double amount){
	if(amount >= maxDepositBalance){
		balance = balance + amount;
		System.out.println("amount deposited :" +balance);
	}

}
@Override
public void withdraw(double amount){
	if(withdrawCount > 1){
		System.out.println("you only withdraw per day 250000 only" +balance);
	}
	if(balance - amount  <= minBalance){
		System.out.println("you only withdraw per day 250000 only" +balance);
	}
	balance = balance - amount;
	withdrawCount++;
}

}

class CurrentAccount extends BankAccount{
	public CurrentAccount(String accountHoldername,int accountNumber,double minBalance,double maxDepositBalance,int interest){
		this.accountHoldername = accountHoldername;
		this.accountNumber = accountNumber;
		this.minBalance = 25000;
		this.maxDepositBalance =50000;
		this.interest = 2;
	}

	@Override
	void updateNomineeDetails(String branchName, Address address) {
		this.branchName = branchName;
		this.address = address;
	}

	@Override
	public void deposit(double amount){
		balance = balance + amount;
		System.out.println("amount deposited :" +balance);
	}
	@Override
	public void withdraw(double amount){
		if(balance - amount <= minBalance){
			balance = balance - amount;
			System.out.println("withdraw your money: "+balance);
		}

	}
}
class SalariedAccount extends BankAccount{
	public SalariedAccount(String accountHoldername,int accountNumber,double minBalance,double maxDepositBalance,int interest){
		this.accountHoldername = accountHoldername;
		this.accountNumber = accountNumber;
		this.minBalance = 0;
		this.maxDepositBalance = 50000;
		this.interest = 2;

	}

	@Override
	void updateNomineeDetails(String branchName, Address address) {
		this.branchName = branchName;
		this.address = address;
	}

	@Override
public void deposit(double amount){
	if(amount >= maxDepositBalance){
		balance = balance + amount;
		System.out.println("amount deposited :" +balance);
	}

}
@Override
public void withdraw(double amount){
	if(balance - amount <= minBalance){
			balance = balance - amount;
			System.out.println("withdraw your money: "+balance);
		}
	
}
}