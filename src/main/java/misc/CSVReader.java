package misc;

import java.io.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class is to read CSV files
 */
public class CSVReader {
    static String fileLocation = "/Users/s0k02c9/Desktop/jars/StoreItem.csv";
    static String lineSeperator = ",";
    static void csvReader() {
        try(BufferedReader br = new BufferedReader(new FileReader(fileLocation))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                String regex = "([0-9a-zA-z]{8}-[0-9a-zA-z]{4}-[0-9a-zA-z]{4}-[0-9a-zA-z]{4}-[0-9a-zA-z]{12} [0-9]{4})";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    System.out.println(matcher.group());
                }
               /*Arrays.stream(line.split(lineSeperator)).forEach((e) -> {
                    sb.append(e);
                    sb.append(" *** ");
                });
                for (String s : line.split(lineSeperator)) {
                    sb.append(s);
                    sb.append(' ');
                }
                line = br.readLine();
                sb.append('\n');*/
                line = br.readLine();
            }
            //System.out.println(sb.toString());
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
        }
    }

    public static void main(String[] args) {
        csvReader();
    }
}
