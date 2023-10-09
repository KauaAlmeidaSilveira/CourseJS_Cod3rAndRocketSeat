package FunctionLambda;

import Model.Entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciseStream {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter path: ");
        String path = sc.nextLine();

        System.out.print("Enter salary: ");
        Double salary = sc.nextDouble();

        List<Employee> list = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null){
                String[] parts = line.split(",");

                list.add(new Employee(parts[0], parts[1], Double.parseDouble(parts[2])));

                line = br.readLine();
            }

            List<String> emailsEmployee = list.stream()
                    .filter(e -> e.getGrossSalary() > salary)
                    .map(Employee::getEmail)
                    .sorted()
                    .toList();

            System.out.printf("Emails of people whose salary is more than %.2f:%n", salary);

            emailsEmployee.forEach(System.out::println);

            Double sumSalaryPeoples = list.stream()
                            .filter(e -> e.getName().charAt(0) == 'M')
                                    .map(Employee::getGrossSalary)
                                            .reduce(0.0, Double::sum);


            System.out.printf("Sum of salaries of people whose name starts with 'M': %.2f", sumSalaryPeoples);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
