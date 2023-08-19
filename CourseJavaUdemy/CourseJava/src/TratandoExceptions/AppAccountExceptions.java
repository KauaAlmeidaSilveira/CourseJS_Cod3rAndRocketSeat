package TratandoExceptions;

import Model.Entities.Account;
import Model.Entities.AccountExceptions;

import java.util.Scanner;

public class AppAccountExceptions {
    public static void main(String[] args) {

        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = sc.nextInt();

            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account acc = new AccountExceptions(number, holder, balance, withdrawLimit);

            System.out.print("Enter amount for withdraw: ");
            double withdraw = sc.nextDouble();

            acc.withdraw(withdraw);

            System.out.print("New balance: " + acc.getBalance());

            sc.close();
        }catch (IllegalArgumentException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }


    }
}
