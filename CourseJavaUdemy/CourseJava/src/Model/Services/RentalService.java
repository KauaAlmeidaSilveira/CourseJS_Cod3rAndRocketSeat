package Model.Services;

import Model.Entities.CarRental;

import java.time.Duration;

public class RentalService {

    private Double

    private ITaxService taxService;

    public RentalService(ITaxService taxService) {
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes/60;

        double

    }

}
