package ReadingFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Kauã\\Desktop\\Kaua\\myStudies\\CourseJavaUdemy\\CourseJava\\src\\readingFile\\in");

        try(Scanner sc = new Scanner(file)){
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
