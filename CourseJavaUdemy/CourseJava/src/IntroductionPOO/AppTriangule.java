package IntroductionPOO;

import java.util.Scanner;

import Model.Entities.Triangle;

public class AppTriangule {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		System.out.printf("Measures of triangle X: %.4f%n"
						+  "Measures of triangle Y: %.4f%n", x.areaTringule(), y.areaTringule());
		
		if(x.areaTringule() > y.areaTringule()) {
			System.out.println("Larger area: X");
		}else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}
}
