package thread;

// Creating a thread
public class Thread101 {
    public static void main(String[] args) {
        System.out.println("Main start");
        new FirstThread();
        new FirstThread();

        Thread th = new SecondThread();
        th.start();

        Runnable r = new ThirdThread();
        System.out.println("Main End");

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am inside anonymous class");
            }
        }).start();
    }
}

class FirstThread extends Thread {
    private static int count = 0;
    int id = 0;
    @Override
    public void run() {
        System.out.println(String.format("Running thread with count %d", id));
    }

    public FirstThread() {
        this.id = ++count;
        this.start();
    }
}

class SecondThread extends Thread {
    private static int count = 0;
    int id = 0;
    @Override
    public void run() {
        System.out.println(String.format("Running SecondThread with count %d", id));
    }

    public SecondThread() {
        this.id = ++count;
    }
}

class ThirdThread implements Runnable {
    private static int count = 0;
    int id = 0;
    @Override
    public void run() {
        System.out.println(String.format("Running ThirdThread with count %d", id));
    }

    public ThirdThread() {
        this.id = ++count;
        new Thread(this).start();
    }
}
