package Model.Services;

public class UsaInterestService implements IInterestService{

    private final double interestRate;

    public UsaInterestService(double interetRate) {
        this.interestRate = interetRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
