package EstruturaRepetitiva;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int somaNum = 0;
		
		while(num != 0) {
			somaNum += num;
			num = sc.nextInt();
		}
		
		System.out.println(somaNum);
		
		sc.close();
	}

}
