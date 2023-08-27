package Model.Services;

public class BasicPaymentService {
    public Double payment(Double pricePerHour, Double pricePerDay, Double hours){
        double basicPayment;
        if(hours <= 12){
            basicPayment = pricePerHour*Math.ceil(hours);
        }else {
            basicPayment = pricePerDay*Math.ceil(hours/24);
        }
        return basicPayment;
    }
}
