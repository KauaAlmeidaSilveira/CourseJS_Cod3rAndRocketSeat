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
        LocalDate data;
        for (int i = 0; i < numInstallments; i++) {
            if (!contract.getInstallments().isEmpty()) {
                Installment lastInstallment = contract.getInstallments().get(contract.getInstallments().size() - 1);
                data = lastInstallment.getDueDate().plusMonths(1);

                int numInstallment = contract.getInstallments().indexOf(lastInstallment) + 1;
                double simplesInterest = paymentService.simpleInterest(vlrIntallments, numInstallment);
                double taxPayment = paymentService.taxPayment(simplesInterest);

                contract.getInstallments().add(new Installment(data, taxPayment));
            } else {
                data = contract.getDate().plusMonths(1);

                double simplesInterest = paymentService.simpleInterest(vlrIntallments, 0);
                double taxPayment = paymentService.taxPayment(simplesInterest);

                contract.getInstallments().add(new Installment(data, taxPayment));
            }
        }

    }
}
