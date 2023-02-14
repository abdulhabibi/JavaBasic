package BankOOPSExample;

public class Customer {
	private String firstName;
	private String lastName;
	private int accountNumber;
	private double balance;
	public Customer() {
		this.firstName = "";
		this.lastName = "";
		this.accountNumber = 0;
		this.balance = 0;
	}
	public Customer(String firstName, String lastName, int accountNumber, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAccountNumber() {
		return this.accountNumber;
	}
	public void setAccountNumer(int accountNumber) {
		// check to see if the account number already is provided,
		// if so, then do not assign the new number and print a message that account is
		// set
		// if its the first time that we are assigning the account number for this
		// object, then we can assign it
		if (this.accountNumber == 0) {
			this.accountNumber = accountNumber;
		} else {
			System.out.println("The account number is already assigned to this Customer.");
		}
	}
	public double getBalance() {
		return this.balance;
	}
	public void deposit(double amount) {
		// add the amount to the balance
		balance += amount;
	}
	public void withdraw(double amount) {
		// if the amount is less than the balance,
		// subtract the amount from the balance
		// otherwise, print a message and say that amount is more that balance
		if (amount < balance) {
			System.out.println("Successful withdraw: $" + amount);
			balance -= amount;
		} else {
			System.out.println("Withdraw Failed: Insufficient balance. The amount of $" + amount + " is more than your balance ($" + balance +").");
		}
	}
	@Override
	public String toString() {
//		return "[FirstName: " + this.firstName
//				+ ", LastName: " + this.lastName
//				+ ", Account#: " + this.accountNumber
//				+ ", Balance: $" + this.balance
//				+ "]";
		
		String temp = "******************\nAccount#: "
				+ accountNumber
				+ "\nFull Name: " + firstName + " " + lastName
				+ "\n$" + balance + "\n******************\n";
		
		
		return temp;
	}
	// create a toString method
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setFirstName("Jack");
		c.setLastName("Ma");
		c.setAccountNumer(123456);
		c.deposit(158.65);
		c.deposit(15.58);
		c.withdraw(50);
		c.withdraw(150);
		
		
		String test = c.toString();
		System.out.println(c);
	}
}
