package java8;

public class TestDiamondProblem {
    public static void main(String[] args) {
        BaseClass b = new BaseClass();
        b.printName();
    }
}

interface A {
    default void printName() {
        System.out.println("Saurav");
    }
}

interface B extends A {
    default void printName() {
        System.out.println("Kumar");
    }
}

interface C extends A {
    default void printName() {
        System.out.println("Saurav Kumar");
    }
}

class BaseClass implements B, C {
    public void printName() {
        //new BaseClass().printName();

            C.super.printName();

        /*A a = new BaseClass();
        a.printName();
        ;*/
    }
}
