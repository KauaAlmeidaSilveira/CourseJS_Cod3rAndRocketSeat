package Model.Entities;

public abstract class Taxpayer {

    protected String name;
    protected Double income;

    public Taxpayer(String name, Double income) {
        this.name = name;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public abstract Double tax();
}
