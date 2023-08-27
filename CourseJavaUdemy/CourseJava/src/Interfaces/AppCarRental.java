package Interfaces;

import Model.Entities.CarRental;
import Model.Entities.Vehicle;
import Model.Services.BasicPaymentService;
import Model.Services.BrasilTaxService;
import Model.Services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class AppCarRental {
    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rental data: ");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Car removal (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Car return (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Enter price per hour: ");
        Double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        Double pricePerDay = sc.nextDouble();

        RentalService rs = new RentalService(pricePerHour, pricePerDay, new BrasilTaxService(), new BasicPaymentService());

        rs.processInvoid(carRental);

        System.out.println("Basic Payment: " + carRental.getInvoice().getBasicPayment());
        System.out.println("Tax: " + carRental.getInvoice().getTax());
        System.out.println("Total Payment: " + carRental.getInvoice().totalPayment());

        sc.close();
    }
}
