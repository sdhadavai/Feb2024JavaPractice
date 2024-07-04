package encapasignments;

public class BankAccount {

	private String accountNumber;
	private double balance;
	private String owner;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void deposite(double amount) {
		double balance = getBalance();
		balance = balance + amount;
		setBalance(balance);
		System.out.println("Depositted amount" + amount + " suscessfully");
	}
	
	public void withdraw(double amount) {
		double balance = getBalance();
		balance = balance - amount;
		setBalance(balance);
		System.out.println("Withdrawn amount" + amount + " suscessfully");
	}
	
	public void printStatement() {
		System.out.println("Account Number is:" + getAccountNumber());
		System.out.println("Owner Name is:" + getOwner());
		System.out.println("Current Balance is:" + getBalance());
	}

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount();
		ba.setAccountNumber("325235");
		ba.setBalance(10000);
		ba.setOwner("Srinvas");
		ba.printStatement();
		System.out.println("--deposite 25000--");
		ba.deposite(25000);
		ba.printStatement();
		
		System.out.println("--withdraw 5000--");
		ba.deposite(5000);
		ba.printStatement();
	}
	
//How can encapsulation be used to hide implementation details from user of a class?

//What are the benefits of using private attributes in a class?

//What is the difference between a getter method and a setter method?

//How can encapsulation improve the readability of code?

}
