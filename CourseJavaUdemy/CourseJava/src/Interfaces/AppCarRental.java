package Interfaces;

import Model.Entities.CarRental;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AppCarRental {
    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        String modelCar = sc.nextLine();
        System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
        String pickupCar = sc.nextLine();
        System.out.print("Return (dd/MM/yyyy hh:ss): ");
        String returnCar = sc.nextLine();
        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        CarRental rental = new CarRental(modelCar, LocalDateTime.parse(pickupCar, fmt), LocalDateTime.parse(returnCar, fmt),pricePerHour,pricePerDay);

        System.out.println("INVOICE:");
        System.out.printf("Basic payment: %.2f%n",rental.payment());
        System.out.printf("Tax: %.2f%n",rental.tax());
        System.out.printf("Total payment: %.2f%n",rental.paymentWithTaxes());

        sc.close();
    }
}
