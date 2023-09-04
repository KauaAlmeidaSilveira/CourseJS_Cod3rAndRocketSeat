package Model.Entities;

public class OutsourcedEmployee extends Employee{

    private Double additionalCharge;

    public OutsourcedEmployee(String name, Integer hour, Double vlrPerHour, Double additionalCharge) {
        super(name, hour, vlrPerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment(){
        return hour * vlrPerHour + (additionalCharge*1.1);
    }
}
