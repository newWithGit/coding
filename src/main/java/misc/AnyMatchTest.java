package misc;

import java.util.Arrays;
import java.util.List;

public class AnyMatchTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Saurav", "Kumar");
        boolean bool = names.stream().anyMatch(name -> name.equalsIgnoreCase("Kumar"));
        System.out.println(bool);
    }
}
