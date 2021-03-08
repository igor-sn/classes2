package entities;

public class Account {
	
	private int number;
	private String holder;
	private double value;
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
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

	public double getValue() {
		return value;
	}

	public void deposit (double value) {
		this.value += value;
	}
	
	public void withdraw (double value) {
		this.value -= value + 5;	
	}

	public String toString() {
		return "Account: " + number + ", Holder: " + holder + ", Balance: $" + value;
	}
	
}
