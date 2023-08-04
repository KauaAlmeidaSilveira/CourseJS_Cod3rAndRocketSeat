package ArrayList;

import java.util.Locale;
import java.util.Scanner;

public class IntroductionArray {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		double num = 0;
		
		for(int i = 0; i<n; i++) {
			vect[i] = sc.nextDouble();
			num += vect[i];
		}
		
		System.out.printf("Média: %.2f", (num/vect.length));
	
		
		sc.close();
	}

}
