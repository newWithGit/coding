package hackerrank.compete;

import java.util.regex.Pattern;

public class RegexIPAdd {

    public static void main(String[] args) {
        Pattern ipAddPattern = Pattern.compile("\\{0-255}");
        System.out.println(ipAddPattern.matcher("254").matches());
    }

}
