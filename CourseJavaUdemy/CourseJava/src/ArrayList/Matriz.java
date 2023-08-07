package ArrayList;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		int negativeNumbers = 0;
		
		for(int l = 0; l<mat.length; l++) {
			for(int c = 0; c<mat[l].length; c++) {
				mat[l][c] = sc.nextInt();
			}
		}
		
		System.out.printf("Matriz: %n");
		
		for(int l = 0; l<mat.length; l++) {
			for(int c = 0; c<mat[l].length; c++) {
				if(mat[l][c] < 0) {
					negativeNumbers++;
				}
				
				if(c == n-1) {
					System.out.printf("%d%n",mat[l][c]);
				}else {
					System.out.printf("%d ",mat[l][c]);
				}
			}
		}
		
		System.out.printf("Main Diagonal: %n");
		
		for(int l = 0; l<mat.length; l++) {
			System.out.printf("%d ", mat[l][l]);
		}
		
		System.out.printf("%nNegative Numbers = %d", negativeNumbers);
		
		sc.close();
	}

}
