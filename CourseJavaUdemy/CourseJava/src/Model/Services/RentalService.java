package Model.Services;

import Model.Entities.CarRental;
import Model.Entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private ITaxService taxService;
    private BasicPaymentService basicPaymentService;

    public RentalService(Double pricePerHour, Double pricePerDay, ITaxService taxService, BasicPaymentService basicPaymentService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
        this.basicPaymentService = basicPaymentService;
    }

    public void processInvoice(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes/60;

        double basicPayment = basicPaymentService.payment(hours, pricePerHour, pricePerDay);
        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }

}
