package hackerrank.compete;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCountSpaces {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher("geeta is a very good girl");
        System.out.println(matcher.matches());
    }

}
