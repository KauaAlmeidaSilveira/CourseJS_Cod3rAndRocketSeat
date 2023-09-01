package Model.Services;

public class PaypalService implements IOnlinePaymentService {
    @Override
    public double simpleInterest(double vlrInstallment, double numInstallment) {
        if (numInstallment == 0) {
            numInstallment++;
            return vlrInstallment * ((0.01 * (numInstallment)) + 1);
        }
        return vlrInstallment * ((0.01 * (numInstallment + 1)) + 1);
    }

    @Override
    public double taxPayment(double vlrInstallment) {
        return vlrInstallment * 1.02;
    }
}
