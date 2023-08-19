package IntroductionPOO;

import java.util.Locale;
import java.util.Scanner;

import Model.Entities.Employee;

public class AppEmployee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		
		System.out.printf("Name: ");
		String name = sc.nextLine();
		
		System.out.printf("GrossSalary: ");
		Double grossSalary = sc.nextDouble();
		
		System.out.printf("Tax: ");
		Double tax = sc.nextDouble();
		
		Employee employee = new Employee(name, grossSalary, tax);
		
		employee.showInfoEmployee();
		
		System.out.printf("Which percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());
		
		employee.showInfoEmployee();
		
		sc.close();
	}

}
