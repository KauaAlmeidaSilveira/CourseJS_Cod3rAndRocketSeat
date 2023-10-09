package FunctionLambda;

import Model.Entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Function {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getPrice() > 20);
        //double sum = list.stream().filter(p -> p.getPrice() > 20).mapToDouble(Product::getPrice).sum();


        names.forEach(System.out::println);
        System.out.println("Sum: " + sum);
    }
}

