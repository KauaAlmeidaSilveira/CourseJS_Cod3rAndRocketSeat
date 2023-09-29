package GenericsSetMap;

import Model.Entities.Candidate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ExerciseMapVotes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Candidate, Integer> canditates = new LinkedHashMap<>();

        System.out.print("Enter path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                String[] parts = line.split(",");

                String name = parts[0];
                int votes = Integer.parseInt(parts[1]);

                Candidate candidate = new Candidate(name, votes);

                if (canditates.containsKey(candidate)) {
                    int totalVotes = canditates.get(candidate) + votes;
                    canditates.put(candidate, totalVotes);
                } else {
                    canditates.put(candidate, votes);
                }

                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        canditates.forEach((candidate, integer) -> System.out.println(candidate + ": " + integer));

        sc.close();
    }
}
