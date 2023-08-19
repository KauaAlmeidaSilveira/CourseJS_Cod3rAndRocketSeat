package Model.Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{

    private LocalDate manufactoreDate;

    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public UsedProduct(String name, Double price, LocalDate manufactoreDate) {
        super(name, price);
        this.manufactoreDate = manufactoreDate;
    }

    public LocalDate getManufactoreDate() {
        return manufactoreDate;
    }

    public void setManufactoreDate(LocalDate manufactoreDate) {
        this.manufactoreDate = manufactoreDate;
    }

    @Override
    public String priceTag(){
        return Name + " (used) $ " + Price + " (Manufacture date: " + fmt.format(manufactoreDate) + ")";
    }
}
