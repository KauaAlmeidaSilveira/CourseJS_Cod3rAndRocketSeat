package Model.Entities;

public class AccountExceptions extends Account{

    private Double withdrawLimit;

    public AccountExceptions(Integer number, String holder, double balance, Double withdrawLimit) {
        super(number, holder, balance);
        this.withdrawLimit = withdrawLimit;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    @Override
    public void withdraw(double withdraw) {
        if(withdraw > withdrawLimit){
            throw new IllegalArgumentException("The amount exceeds withdraw limit");
        }else if(balance-withdraw < 0){
            throw new IllegalArgumentException("Not enough balance");
        }else{
            balance -= withdraw;
        }
    }
}
