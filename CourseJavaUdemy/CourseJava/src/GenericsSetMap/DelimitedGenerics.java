package GenericsSetMap;

import Model.Entities.Product;
import Model.Services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DelimitedGenerics {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        String path = "C:\\Users\\Kauã\\Desktop\\Kaua\\myStudies\\CourseJavaUdemy\\CourseJava\\src\\GenericsSetMap\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null){
                String[] parts = line.split(",");
                list.add(new Product(parts[0], Double.parseDouble(parts[1])));
                line = br.readLine();
            }

            Product maxPrice = CalculationService.max(list);
            System.out.println("Most Expensive: ");
            System.out.println(maxPrice);


        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
