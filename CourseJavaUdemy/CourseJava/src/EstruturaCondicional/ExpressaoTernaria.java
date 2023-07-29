package EstruturaCondicional;

import java.util.Scanner;

public class ExpressaoTernaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double vlr = sc.nextDouble();
		
		double vlrDesconto = vlr < 20 ? vlr * 0.1 : vlr * 0.05;
		
		double vlrFinal = vlr - vlrDesconto;
		
		System.out.printf("Valor com desconto: %.2f", vlrFinal);
		
		sc.close();

	}

}
