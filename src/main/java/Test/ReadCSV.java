package Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class ReadCSV {

    public static void main(String[] args) {
        readCSV("C:\\Users\\sauravk\\Documents\\Personal\\Walmart\\TEST_2.csv");
    }

    private static void readCSV(String path) {
        try(BufferedReader is = new BufferedReader(new FileReader(path))) {
            String line = "";
            //System.out.println(is.nextLine());
            while ( (line = is.readLine()) != null) {
                //System.out.println(line);

                System.out.println(Arrays.toString(line.split(",")));
                //System.out.println(line.replaceAll("\\n", "").split("Test,").length);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
