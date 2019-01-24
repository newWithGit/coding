package thread.common;

import java.util.concurrent.TimeUnit;

public class LoopTaskA implements Runnable {
    private static int count = 0;
    private int id = 0;
    @Override
    public void run() {
        System.err.println("Start");
        for (int i = 0; i < 20; i++) {
            System.out.println(String.format("I am: %d", id));
            try {
                TimeUnit.SECONDS.sleep((long) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.err.println("End");
    }

    public LoopTaskA() {
        this.id = ++count;
    }
}
