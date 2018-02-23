package com.kgfsl.parseex;

import com.opencsv.CSVReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws IOException{
    String fileName = "src/main/resources/numbers.csv";

        try (FileInputStream fis = new FileInputStream(fileName);
                InputStreamReader isr = new InputStreamReader(fis, 
                        StandardCharsets.UTF_8);
                CSVReader reader = new CSVReader(isr)) {
            String[] nextLine;

            while ((nextLine = reader.readNext()) != null) {

                for (String e : nextLine) {
                    System.out.format("%s,", e);
                }
            }
        } catch(Exception e){
            System.out.println(e);
            
        }
}
}