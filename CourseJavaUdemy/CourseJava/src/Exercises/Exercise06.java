package Exercises;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.printf("Deseja criar uma matriz de quantas linhas? ");
		int linhas = sc.nextInt();
		
		System.out.printf("E quantas colunas? ");
		int colunas = sc.nextInt();
		
		int[][] matriz = new int[linhas][colunas];
		
		for(int l=0; l<matriz.length; l++) {
			for(int c=0; c<matriz[l].length; c++) {
				matriz[l][c] = sc.nextInt();
			}
		}
		
		System.out.printf("matriz: %n");
		
		for(int l=0; l<matriz.length; l++) {
			for(int c=0; c<matriz[l].length; c++) {
				if(c == matriz[l].length - 1) {
					System.out.printf("%d%n", matriz[l][c]);
				}else {
					System.out.printf("%d ", matriz[l][c]);
				}
			}
		}
		
		System.out.printf("Digite o numero no qual deseja saber a posição em cordenadas: ");
		int num = sc.nextInt();
		
		for(int l=0; l<matriz.length; l++) {
			for(int c=0; c<matriz[l].length; c++) {
				if(matriz[l][c] == num) {
					System.out.printf("Position %d,%d:%n", l, c);
					if (c > 0) {
						System.out.printf("Left: %d%n", matriz[l][c-1]);
					}
					if (l > 0) {
						System.out.printf("Up: %d%n", matriz[l-1][c]);
					}
					if (c < matriz[l].length-1) {
						System.out.printf("Right: %d%n", matriz[l][c+1]);
					}
					if (l < matriz.length-1) {
						System.out.printf("Down: %d%n", matriz[l+1][c]);
					}
				}
			}
		}
		
		sc.close();
	}

}
