package dateTimeNewApi;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class LocalDateTime {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2019, 03,16);
        LocalDate christmas = LocalDate.of(2019, 12,25);
        //LocalDate incorrect = LocalDate.of(2019, 11,31);
        System.out.println(date);
        System.out.println(date.isBefore(christmas));
        System.out.println(date.isAfter(christmas));
        //System.out.println(incorrect.isAfter(date));

        Period period = Period.ofMonths(2);
        System.out.println(christmas.minusMonths(period.getMonths()));
        int i = '5';
        m(i);
        m('5');

    }

    private static void m(int x) {
        System.out.println("int version" + x);
    }

    private static void m(char x) {
        System.out.println("char version"+x);
    }

}

class Student {
    private String name;
    private int age;

    void Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }
}


