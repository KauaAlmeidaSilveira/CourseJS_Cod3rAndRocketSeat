package FunctionLambda;

import Model.Entities.Product;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ResolvedExercise {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        String path = JOptionPane.showInputDialog("Path: ");

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                String[] parts = line.split(",");

                String name = parts[0];
                Double price = Double.parseDouble(parts[1]);

                products.add(new Product(name, price));

                line = br.readLine();
            }

            /*
            ProductService ps = new ProductService();
            double averagePrice = ps.averagePrices(products);
            */

            double averagePrice = products.stream()
                    .map(Product::getPrice)
                    .reduce(0.0, Double::sum) / products.size();

            System.out.printf("Average prices: %.2f%n", averagePrice);

            Comparator<String> comp = Comparator.comparing(String::toUpperCase);

            List<String> namesOfProducts = products.stream()
                    .filter(p -> p.getPrice() < averagePrice)
                    .map(Product::getName)
                    .sorted(comp.reversed())
                    .toList();

            namesOfProducts.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
