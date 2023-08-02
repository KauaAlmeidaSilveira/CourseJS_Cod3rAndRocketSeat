package Entities;

import java.io.PrintStream;

public class Account {

	private Integer number;
	private String holder;
	private double balance;
	
	private int tax = 5;
	
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

	public PrintStream deposit(double deposit) {
		this.balance += deposit;
		return System.out.printf("Updated account data:%n"
								+"Account %d, Holder: %s, Balance: $ %.2f%n", this.number, this.holder, this.balance); 
	}
	
	public PrintStream withdraw(double withdraw) {
		this.balance -= withdraw+tax;
		return System.out.printf("Updated account data:%n"
								+"Account %d, Holder: %s, Balance: $ %.2f%n", this.number, this.holder, this.balance); 
	}
	
	public PrintStream showInfoAccount() {
		return System.out.printf("%nAccount data:%n"
								+"Account %d, Holder: %s, Balance: $ %.2f%n", this.number, this.holder, this.balance);
	}
	
	public String toString() {
		return "Account " + number + ", holder:" + holder + ", balance: $ " + balance;
	}
}
