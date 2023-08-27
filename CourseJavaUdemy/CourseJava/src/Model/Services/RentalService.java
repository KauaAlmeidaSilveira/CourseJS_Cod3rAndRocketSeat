package Model.Services;

import Model.Entities.CarRental;
import Model.Entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;
    private BasicPaymentService basicPaymentService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService, BasicPaymentService basicPaymentService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
        this.basicPaymentService = basicPaymentService;
    }

    public void processInvoid(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes/60;

        double basicPayment = basicPaymentService.payment(pricePerHour, pricePerDay, hours);

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }

}
