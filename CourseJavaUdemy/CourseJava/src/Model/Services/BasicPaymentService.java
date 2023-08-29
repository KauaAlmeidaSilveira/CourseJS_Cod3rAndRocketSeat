package Model.Services;

public class BasicPaymentService {
    public Double payment(double hours, double pricePerHour, double pricePerDay){
        if(hours <= 12){
            return pricePerHour*Math.ceil(hours);
        }else {
            return pricePerDay*Math.ceil(hours/24);
        }
    }
}
