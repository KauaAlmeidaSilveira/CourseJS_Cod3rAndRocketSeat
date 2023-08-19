package HerancaPolimorfismo;

import Model.Entities.Account;
import Model.Entities.BusinessAccount;
import Model.Entities.SavingsAccount;

public class SobreposicaoOverride {
    public static void main(String[] args) {

        Account acc1 = new Account(1001, "Kaua", 1000.0);
        acc1.withdraw(200);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Nary", 1000.0, 0.01);
        acc2.withdraw(200);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200);
        System.out.println(acc3.getBalance());

    }
}
