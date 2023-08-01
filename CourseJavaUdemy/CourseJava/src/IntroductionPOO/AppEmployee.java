package IntroductionPOO;

import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class AppEmployee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		
		Employee employee = new Employee();
		
		System.out.printf("Name: ");
		employee.Name = sc.nextLine();
		
		System.out.printf("GrossSalary: ");
		employee.GrossSalary = sc.nextDouble();
		
		System.out.printf("Tax: ");
		employee.Tax = sc.nextDouble();
		
		employee.showInfoEmployee();
		
		System.out.printf("Which percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());
		
		employee.showInfoEmployee();
		
		sc.close();
	}

}
