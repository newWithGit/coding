package Test;


import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test extends Tester{

    int val;

    Test() {}

    Test(int val) {
        this.val = val;
        System.out.println(this.val);
    }

    Test(int num, int val) {
        //super(num);
        //this(val);
        //super.num = num;



    }

    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(20);

        int i = 0;
        while(i++ < 20) {
            new MyRunnable().start();
        }
        ex.shutdown();

    }
    
    private static void tool(StringBuilder sb) {
        sb.append("Kumar");
    }

}

class MyRunnable extends Thread {
    static int count = 1;
    static int endCount = 1;
    @Override
    public void run() {
        System.out.println("count "+ ++count);
        if (count == 10) {
            throw new RuntimeException();
        } else {
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("endCount "+endCount++);

    }
}

class Tester {
    int num;

    Tester() {}

    Tester(int num) {
        this.num = num;
        System.out.println(num);
    }
}





