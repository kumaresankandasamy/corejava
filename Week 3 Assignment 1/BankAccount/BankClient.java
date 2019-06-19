public class BankClient{
	public static void main(String[] args) {
		
		BankAccount savingsAccount = new SavingsAccount("Ram",1,10000,50000,2);
		BankAccount currentAccount = new CurrentAccount("Raja",2,25000,50000,2);
		savingsAccount.deposit(60000);
		savingsAccount.withdraw(30000);
        currentAccount.deposit(40000);
		currentAccount.withdraw(30000);
	}
}