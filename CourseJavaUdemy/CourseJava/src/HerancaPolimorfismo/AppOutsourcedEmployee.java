package HerancaPolimorfismo;

import Model.Entities.Employee;
import Model.Entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppOutsourcedEmployee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int numOfEmployees = sc.nextInt();

        for(int i =0; i<numOfEmployees; i++){
            System.out.printf("Employee #%d data: %n", (i+1));
            System.out.print("Outsourced (y/n)? ");
            char isOutsourced = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hour = sc.nextInt();

            System.out.print("Value per hour: ");
            double vlrPerHour = sc.nextDouble();

            if(isOutsourced == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name, hour, vlrPerHour, additionalCharge));
            }else{
                employees.add(new Employee(name, hour, vlrPerHour));
            }
        }

        System.out.println("Payments: ");

        employees.forEach(employee -> System.out.printf("%s - $ %.2f%n", employee.getName(), employee.payment()));

        sc.close();
    }
}
