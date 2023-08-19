package HerancaPolimorfismo;

import Model.Entities.Account;
import Model.Entities.SavingsAccount;

public class Polimorfismo {
    public static void main(String[] args) {
        Account acc1 = new Account(1001, "kaua", 1000.0);
        Account acc2 = new SavingsAccount(1002, "Nary", 1000.0, 0.01);

        acc1.withdraw(50);
        acc2.withdraw(50);

        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());
    }
}
