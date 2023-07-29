package EstruturaCondicional;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		switch(num) {
			case 1:
				System.out.println("Dia da semana: Domingo");
				break;
			case 2: 
				System.out.println("Dia da semana: Segunda");
				break;
			case 3:
				System.out.println("Dia da semana: Terça");
				break;
			case 4: 
				System.out.println("Dia da semana: Quarta");
				break;
			case 5:
				System.out.println("Dia da semana: Quinta");
				break;
			case 6: 
				System.out.println("Dia da semana: Sexta");
				break;
			case 7: 
				System.out.println("Dia da semana: Sábado");
				break;
			default:
				System.out.println("Valor invalido !!");
		}
		
		sc.close();
	}

}
