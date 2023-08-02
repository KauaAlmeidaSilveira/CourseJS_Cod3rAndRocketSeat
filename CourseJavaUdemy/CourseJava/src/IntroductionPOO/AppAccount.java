package IntroductionPOO;

import java.util.Scanner;

import Entities.Account;

public class AppAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Account account;
		
		System.out.printf("Enter account number: ");
		int number = sc.nextInt();

		sc.nextLine();
		System.out.printf("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.printf("Is there na initial deposit (y/n)? ");
		String initialDeposit = sc.nextLine();
		
		if(initialDeposit.charAt(0) == 'y') {
			System.out.printf("Enter initial deposit value: ");
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
		
		sc.close();
	}

}
