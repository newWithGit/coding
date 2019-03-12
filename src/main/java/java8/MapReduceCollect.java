package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapReduceCollect {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>(Arrays.asList(1,5,6,7,8,9,7,5,1,6,4,56,465,5));
        long reduce = num.stream()
                .reduce(0, (a,b) -> a+b)
                .longValue();

        System.out.println(reduce);

        long sum = num.stream()
                .mapToLong(Integer::intValue)
                .sum();

        System.out.println(sum);

    }
}
