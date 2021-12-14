package entities;

public class Account {
	
	public static final double TAX = 5.00;
	
	private int number;
	private String holder;
	private double balance;
	
	public Account() {
	}

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public void deposit(double amount) {
		 balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + TAX;
	}
	
	public String toString() {
		return "Account: " + number + 
				", Holder: " + holder +
				", Balance: $ " + String.format("%.2f%n", balance);
	}

	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
}