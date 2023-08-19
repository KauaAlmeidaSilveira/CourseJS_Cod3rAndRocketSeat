package Model.Entities;

public class LegalPerson extends Taxpayer{

    private Integer numOfEmployee;

    public LegalPerson(String name, Double income, Integer numOfEmployee) {
        super(name, income);
        this.numOfEmployee = numOfEmployee;
    }

    public Integer getNumOfEmployee() {
        return numOfEmployee;
    }

    public void setNumOfEmployee(Integer numOfEmployee) {
        this.numOfEmployee = numOfEmployee;
    }

    @Override
    public Double tax() {
        if(numOfEmployee < 10){
            return income*0.16;
        }else {
            return income*0.14;
        }
    }
}
