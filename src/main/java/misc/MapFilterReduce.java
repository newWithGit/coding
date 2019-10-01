package misc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapFilterReduce {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Geeta", "Saurav", "Gupta", "Kumari");

        names.stream().map(name -> name.length()).forEach(System.out::println);
        Stream<String> nameStartsWithG = names.stream().filter(name -> name.startsWith("G"));
        nameStartsWithG.forEach(System.out::println);
        //nameStartsWithG.forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(2,4,3,6,12,67);
        numbers.stream().reduce((num1, num2) -> num1 * num2).ifPresent(System.out::println);

    }


}
