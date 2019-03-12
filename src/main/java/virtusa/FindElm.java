package virtusa;

import java.util.List;
import java.util.function.Predicate;

public class FindElm {
    private static String findElement(List<Integer> arr, int k) {
        Predicate<Integer> findElement = i -> i == k;
        String got = "NO";
        //boolean gotElement = arr.stream().filter(findElement);
        System.out.println(arr.stream().filter(findElement).count());
        if ((arr.stream().filter(findElement).count()) > 0);
            got = "YES";
        return got;
    }
}
