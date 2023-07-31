package EstruturaRepetitiva;

public class For {

	public static void main(String[] args) {
		
		int num = 10;
		int soma = 0;
		
		for(int i=1; i<=num; i++) {
			System.out.println(i);
			soma += i;
		}
		
		System.out.printf("Soma: %d", soma);

	}

}
