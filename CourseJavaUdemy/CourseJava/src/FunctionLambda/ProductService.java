package FunctionLambda;

import Model.Entities.Product;
import java.util.function.Predicate;
import java.util.List;

public class ProductService {
    public double filteredSum(List<Product> list, Predicate<Product> criteria){
        double sum = 0.0;
        for (Product p: list){
            if (criteria.test(p)){
                sum += p.getPrice();
            }
        }
        return sum;
    }
    public double averagePrices(List<Product> list){
        double sum = 0.0;
        for (Product p: list){
            sum += p.getPrice();
        }
        return sum/list.size();
    }
}
