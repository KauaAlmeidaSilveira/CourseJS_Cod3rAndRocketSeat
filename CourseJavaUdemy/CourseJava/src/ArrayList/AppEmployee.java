package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Model.Entities.Employee;

public class AppEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.printf("How many employees will be registered?");
		int qntEmployees = sc.nextInt();
		
		for(int i = 0; i<qntEmployees; i++) {
			
			System.out.printf("%nEmployee #%d:%n", (i+1));

			System.out.printf("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.printf("Name: ");
			String name = sc.nextLine();
			System.out.printf("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee employee = new Employee(id, name, salary);
			
			employees.add(employee);
		}
		
		System.out.printf("%nEnter the employee id that will be have salary increase: ");
		int idEmployeeSalaryIcrease = sc.nextInt();
		
		Employee employeeIncreaseSalary = employees.stream()
				.filter((employee) -> employee.getId() == idEmployeeSalaryIcrease)
				.findFirst()
				.orElse(null);
		
		if(employeeIncreaseSalary == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.printf("Enter the percentage: ");
			Double percentage = sc.nextDouble();
			
			employeeIncreaseSalary.increaseSalary(percentage);
		}
		
		System.out.printf("%nList of Employees: %n");
		
		employees.forEach((employee) -> {
			System.out.printf("%d, %s, %.2f%n", employee.getId(), employee.getName(), employee.getGrossSalary());
		});
		
		
		sc.close();
	}

}
