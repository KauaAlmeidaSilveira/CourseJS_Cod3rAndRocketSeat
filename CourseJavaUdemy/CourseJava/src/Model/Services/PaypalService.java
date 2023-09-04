package Model.Services;

public class PaypalService implements IOnlinePaymentService {
    @Override
    public double taxPayment(double vlrInstallment) {
        return vlrInstallment * 1.02;
    }

    @Override
    public double simpleInterest(double vlrInstallment, double numInstallment) {
        return vlrInstallment*(1+0.01*numInstallment);
    }
}
