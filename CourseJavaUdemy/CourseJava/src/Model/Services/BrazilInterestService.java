package Model.Services;

public class BrazilInterestService implements IInterestService{

    private final double interestRate;

    public BrazilInterestService(double interetRate) {
        this.interestRate = interetRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
