package Model.Services;

public interface IOnlinePaymentService {
    double simpleInterest(double vlrInstallment, double numInstallment);

    double taxPayment(double vlrInstallment);
}
