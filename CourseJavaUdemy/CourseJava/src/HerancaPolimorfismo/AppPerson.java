package HerancaPolimorfismo;

import Model.Entities.LegalPerson;
import Model.Entities.Person;
import Model.Entities.Taxpayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppPerson {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Taxpayer> taxpayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int numOfTaxPayers = sc.nextInt();

        for(int i=0; i<numOfTaxPayers; i++){

            System.out.printf("Tax Payer #%d data: %n", (i+1));
            System.out.print("Individual company (i/c)? ");
            char individualCompany = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Annual income: ");
            double income = sc.nextDouble();

            if(individualCompany == 'i'){
                System.out.print("Health expenditures: ");
                double expenses = sc.nextDouble();

                taxpayers.add(new Person(name, income, expenses));
            }else {
                System.out.print("Number of Employees: ");
                int numOfEmployee = sc.nextInt();

                taxpayers.add(new LegalPerson(name, income, numOfEmployee));
            }
        }

        System.out.println("TAXES PAID: ");

        taxpayers.forEach( taxpayer -> System.out.printf("%s: $ %.2f%n", taxpayer.getName(), taxpayer.tax()));

        double totalTaxes = 0;
        for(int i=0; i<taxpayers.size(); i++){
            totalTaxes += taxpayers.get(i).tax();
        }

        System.out.printf("TOTAL TAXES: %.2f", totalTaxes);

        sc.close();
    }
}
