package IntroductionInterface;

import Model.Entities.CarRental;
import Model.Entities.Vehicle;
import Model.Services.BasicPaymentService;
import Model.Services.BrazilTaxService;
import Model.Services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class AppCarRental {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter car rental data");
        System.out.print("Enter car model: ");
        String modelCar = sc.nextLine();

        System.out.print("PickUp (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Return (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental carRental = new CarRental(start, finish, new Vehicle(modelCar));

        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService(), new BasicPaymentService());
        rentalService.processInvoice(carRental);

        System.out.println("FATURA: ");

        System.out.println(carRental.getInvoice().showDataInvoice());

        sc.close();
    }
}
