package IntroductionInterface;

import Model.Services.BrazilInterestService;
import Model.Services.IInterestService;

import java.util.Locale;
import java.util.Scanner;

public class DefaultMethods {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        IInterestService br = new BrazilInterestService(1.0);
        double payment = br.payment(amount, months);

        System.out.printf("Payment after %d months: %n", months);
        System.out.printf("%.2f", payment);

        sc.close();
    }
}
