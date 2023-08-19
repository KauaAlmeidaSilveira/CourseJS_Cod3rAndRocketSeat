package IntroductionPOO;

import java.util.Scanner;

import Model.Entities.CurrencyConverter;

public class AppCurrencyConverter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.printf("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.printf("How many dollars will bought? ");
		double qntDollar = sc.nextDouble();

		CurrencyConverter.currencyConverter(dollarPrice, qntDollar);
		
		sc.close();
		
	}

}
