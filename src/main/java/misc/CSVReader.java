package misc;

import java.io.*;
import java.util.Arrays;

/**
 * This class is to read CSV files
 */
public class CSVReader {
    static String fileLocation = "C:\\Users\\sauravk\\Documents\\Study\\SampleBulkCancel.csv";
    static String lineSeperator = ",";
    static void csvReader() {
        try(BufferedReader br = new BufferedReader(new FileReader(fileLocation))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                Arrays.stream(line.split(lineSeperator)).forEach((e) -> {
                    sb.append(e);
                    sb.append(' ');
                });
                /*for (String s : line.split(lineSeperator)) {
                    sb.append(s);
                    sb.append(' ');
                }*/
                line = br.readLine();
                sb.append('\n');
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
        }
    }

    public static void main(String[] args) {
        csvReader();
    }
}
