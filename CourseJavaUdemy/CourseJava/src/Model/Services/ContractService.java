package Model.Services;

import Model.Entities.Contract;
import Model.Entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private final IOnlinePaymentService paymentService;

    public ContractService(IOnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, int numInstallments) {

        double vlrIntallments = contract.getTotalValue() / numInstallments;

        for (int i = 1; i <= numInstallments; i++) {
            LocalDate data = contract.getDate().plusMonths(i);

            double simplesInterest = paymentService.simpleInterest(vlrIntallments, i);
            double taxPayment = paymentService.taxPayment(simplesInterest);

            contract.getInstallments().add(new Installment(data, taxPayment));
        }
    }
}
