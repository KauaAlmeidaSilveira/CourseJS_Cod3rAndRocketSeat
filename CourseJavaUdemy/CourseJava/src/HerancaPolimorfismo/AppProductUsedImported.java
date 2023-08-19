package HerancaPolimorfismo;

import Model.Entities.ImportedProduct;
import Model.Entities.Product;
import Model.Entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppProductUsedImported {
    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numberOfProducts = sc.nextInt();

        for(int i=0; i<numberOfProducts; i++){

            System.out.printf("Product #%d data: %n", (i+1));

            System.out.print("Common, used or imported (c, u, i)? ");
            char caracter = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if(caracter == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();

                products.add(new ImportedProduct(name, price, customsFee));
            }else if(caracter == 'u'){
                sc.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = sc.nextLine();

                products.add(new UsedProduct(name, price, LocalDate.parse(date, fmt)));
            } else if (caracter == 'c') {
                products.add(new Product(name, price));
            }
        }

        System.out.println("Price Tags: ");

        products.forEach(product -> System.out.println(product.priceTag()));

        sc.close();
    }
}
