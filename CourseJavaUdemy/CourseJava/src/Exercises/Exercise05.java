package Exercises;

import java.util.Scanner;

public class Exercise05 {

//	Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ...
//	Lembrando que, por definição, fatorial de 0 é 1.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int fatorial = x;
		
		if(x == 0) {
			System.out.println(1);
		}else {
			for(int i = (x-1); i > 0; i--) {
				
				fatorial = (fatorial*i);
				
			}
			
			System.out.println(fatorial);
		}
		
		sc.close();
	}

}
