package ReadingFile;

import Model.Entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Kauã\\Desktop\\Kaua\\myStudies\\CourseJavaUdemy\\CourseJava\\src\\readingFile\\itens"))){
            String line;
            while((line = br.readLine()) != null){
                String[] content =  line.split(",");
                String name = content[0];
                Double price = Double.parseDouble(content[1]);
                int quantity = Integer.parseInt(content[2]);
                products.add(new Product(name,price,quantity));
            }

            String srcPath = "C:\\Users\\Kauã\\Desktop\\Kaua\\myStudies\\CourseJavaUdemy\\CourseJava\\src\\readingFile";
            boolean success = new File(srcPath + "\\out").mkdir();

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(srcPath+"\\out\\summary.csv"))){
                products.forEach(product -> {
                    try {
                        bw.write(product.summary());
                        bw.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
            }catch (IOException e){
                e.printStackTrace();
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
