package ReadingFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBufferedWriter {
    public static void main(String[] args){
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good Night"};
        String path = "C:\\Users\\Kauã\\Desktop\\Kaua\\myStudies\\CourseJavaUdemy\\CourseJava\\src\\readingFile\\out";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            // Sem o paremetro true, ele recria o arquivo do zero, com TRUE ele adiciona com
            // o que ja tem;
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e ){
            System.out.println("Error: " + e.getMessage());
        }

    }}
