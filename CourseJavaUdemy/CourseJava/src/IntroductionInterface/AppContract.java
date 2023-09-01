package IntroductionInterface;

import Model.Entities.Contract;
import Model.Services.ContractService;
import Model.Services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class AppContract {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter contract data: ");
        System.out.print("Number: ");
        int numberContract = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        sc.nextLine();
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
        System.out.print("Contract value: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(numberContract, date, totalValue);
        ContractService cs = new ContractService(new PaypalService());

        System.out.print("Enter the number of installments: ");
        int numIntallments = sc.nextInt();

        cs.processContract(contract, numIntallments);

        System.out.println("Installments: ");
        contract.showInstallments();


        sc.close();
    }
}
