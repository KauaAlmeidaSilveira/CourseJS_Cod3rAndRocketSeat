package Model.Entities;

public class Person extends Taxpayer{

    private Double expensesWithHealth;

    public Person(String name, Double income, Double expensesWithHealth) {
        super(name, income);
        this.expensesWithHealth = expensesWithHealth;
    }

    public Double getExpensesWithHealth() {
        return expensesWithHealth;
    }

    public void setExpensesWithHealth(Double expensesWithHealth) {
        this.expensesWithHealth = expensesWithHealth;
    }

    @Override
    public Double tax() {
        if(income < 20000){
            return (income*0.15)-(expensesWithHealth*0.5);
        }else {
            return (income * 0.25) - (expensesWithHealth * 0.5);
        }
    }
}
