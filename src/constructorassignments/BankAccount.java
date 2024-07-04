package constructorassignments;

public class BankAccount {
	
	String accountNumber;
	double balance;
	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public void deposite(double amount) {
		balance = balance + amount;
		System.out.println("Your current balance after deposite of " + amount + " is:" + balance);
	}
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Your current balance after withdraw of " + amount + " is:" + balance);
	}

	public static void main(String[] args) {

		BankAccount ba = new BankAccount("7867869", 10000);
		System.out.println("Initial Balance: " + ba.balance);
		System.out.println("Depositing 6000 amount");
		ba.deposite(6000);
		System.out.println("Withdrawing 2000");
		ba.withdraw(2000);
		System.out.println("Withdrawing 1000");
		ba.withdraw(1000);
		System.out.println("Depositing 5000 amount");
		ba.deposite(5000);
	
	}
	
//What is the purpose of an instance variable in Java?

//How are instance variables different from local variables in Java?

//What is the access level of an instance variable in Java?

//What is the purpose of a method in Java?

//Can a method call other methods within the same class?

}
