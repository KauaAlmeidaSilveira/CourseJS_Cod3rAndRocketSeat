package GenericsSetMap;

import Model.Entities.People;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class LogAcess {
    public static void main(String[] args) {

        Set<People> peoples = new HashSet<>();

        String path = "C:\\Users\\Kauã\\Desktop\\Kaua\\myStudies\\CourseJavaUdemy\\CourseJava\\src\\GenericsSetMap\\log";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] parts = line.split(" ");

                String nome = parts[0];
                Instant dateTime = Instant.parse(parts[1]);

                peoples.add(new People(nome, dateTime));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(peoples.size());

    }
}
