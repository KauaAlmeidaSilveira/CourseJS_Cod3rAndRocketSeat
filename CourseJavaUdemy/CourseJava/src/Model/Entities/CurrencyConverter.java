package Model.Entities;

import java.io.PrintStream;

public class CurrencyConverter {

	private static double IOF = 0.06;
	
	public static PrintStream currencyConverter(double dollarPrice, double qntDollar) {
		
		double calc = (dollarPrice*qntDollar)*(1 + IOF);
		
		return System.out.printf("Amount to be paid in reais = R$ %.2f", calc);
	}
}
