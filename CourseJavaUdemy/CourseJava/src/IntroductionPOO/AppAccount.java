package IntroductionPOO;

import java.util.Scanner;

import Model.Entities.Account;

public class AppAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		String initialDeposit = sc.nextLine();
		
		if(initialDeposit.charAt(0) == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialBalance = sc.nextDouble();
			account = new Account(number, holder, initialBalance);
		}else {
			account = new Account(number, holder);
		}
		
		account.showInfoAccount();
		
		System.out.printf("%nEnter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		
		System.out.printf("%nEnter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);

		account.showInfoAccount();
		
		sc.close();
	}

}
