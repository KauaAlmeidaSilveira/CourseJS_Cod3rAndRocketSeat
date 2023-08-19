package Model.Entities;

public class Account {

	private Integer number;
	private String holder;
	protected Double balance;

	public Account(Integer number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Account(Integer number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Integer getNumber() {
		return number;
	}
	public String getHolder() {
		return holder;
	}
	public Double getBalance() {
		return balance;
	}

	public void deposit(double deposit) {
		this.balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		this.balance -= withdraw + 5;
	}

	public void showInfoAccount() {
		System.out.printf("%nAccount data:%n"
				+ "Account %d, Holder: %s, Balance: $ %.2f%n", this.number, this.holder, this.balance);
	}
	
	public String toString() {
		return "Account " + number + ", holder:" + holder + ", balance: $ " + balance;
	}
}
