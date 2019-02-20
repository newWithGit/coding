package java8;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.function.Consumer;

public class ConsumerTest {

    @Test
    public void consumer_1() {
        /*Consumer<List<String>> consumer = (List<String> list) -> {
            //System.out.println(list);
            list.clear();
        };*/
        Consumer<List<String>> consumer = List::clear;
        List<String> list = new ArrayList<>(Arrays.asList("a", "b","c"));
        consumer.accept(list);

        assert(list.isEmpty());
    }

    @Test
    public void consumer_2() {
        Consumer<List<String>> c1 = list -> list.add("first");
        Consumer<List<String>> c2 = list -> list.add("second");

        Consumer<List<String>> consumer = list -> {
            c1.andThen(c2).accept(list);
        };
        List<String> list = new ArrayList<>(Arrays.asList("a", "b","c"));
        consumer.accept(list);
        System.out.println(list);

        assert(list.containsAll(Arrays.asList("a", "b","c","first","second")));
    }
}
