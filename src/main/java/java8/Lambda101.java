package java8;

import java.util.function.Consumer;

public class Lambda101 {
    public static void main(String[] args) {
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(String.format("Hi %s!!", s));
            }
        };

        con.accept("Saurav");

        //Consumer<String> consumer = (String name) -> System.out.println(String.format("Hi %s!!", name));
        Consumer<String> consumer = System.out::println;
        consumer.accept("Geeta");
    }
}
