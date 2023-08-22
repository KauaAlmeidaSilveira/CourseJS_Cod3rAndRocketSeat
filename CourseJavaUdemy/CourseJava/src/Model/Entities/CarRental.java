package Model.Entities;

import java.time.LocalDateTime;

public class CarRental {

    private String modelCar;
    private LocalDateTime pickupCar;
    private LocalDateTime returnCar;
    private Double pricePerHour;
    private Double pricePerDay;
    private Double tax;

    public CarRental(String modelCar, LocalDateTime pickupCar, LocalDateTime returnCar, Double pricePerHour, Double pricePerDay) {
        this.modelCar = modelCar;
        this.pickupCar = pickupCar;
        this.returnCar = returnCar;
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public LocalDateTime getPickupCar() {
        return pickupCar;
    }

    public void setPickupCar(LocalDateTime pickupCar) {
        this.pickupCar = pickupCar;
    }

    public LocalDateTime getReturnCar() {
        return returnCar;
    }

    public void setReturnCar(LocalDateTime returnCar) {
        this.returnCar = returnCar;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public Double payment(){
        int days = returnCar.getDayOfMonth() - pickupCar.getDayOfMonth();
        int hours = returnCar.getHour() - pickupCar.getHour();
        int seconds = returnCar.getSecond() - pickupCar.getSecond();

        double vlrTotal;

        if(days != 0 || hours > 12){
            double vlrDays = days*pricePerDay;
            return vlrDays+130;
        }else{
            if(returnCar.getMinute() + pickupCar.getMinute() > 30){
                return (hours+1)*pricePerHour;
            }else{
                return hours*pricePerHour;
            }
        }
    }

    public Double tax(){
        if(payment() <= 100){
            return payment()*0.2;
        }else{
            return payment()*0.15;
        }
    }

    public Double paymentWithTaxes(){
        return payment()+tax();
    }

}
