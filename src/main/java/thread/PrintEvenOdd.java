package thread;

public class PrintEvenOdd {

    public static void main(String[] args) {
        Thread odd = new Thread(() -> {
            for (int i = 0; i < 100; i++)
                if (i % 2 != 0)
                    System.out.println("i = " + i);

        });

        odd.start();

        Thread even = new Thread(() -> {
            for (int i = 0; i < 100; i++)
                if (i % 2 == 0)
                    System.out.println("i = " + i);
        });

        even.start();
    }

}

class OddEvenThread implements Runnable{
    private boolean even;
    private Printer print;
    private int startIndex;
    private int endIndex;

    OddEvenThread(boolean even, Printer print, int startIndex, int endIndex) {
        this.even = even;
        this.print = print;
        this.startIndex = getOddEvenStartIdx(startIndex);
        this.endIndex = endIndex;
    }

    private int getOddEvenStartIdx(int startIndex) {
        int updatedStartIdx = startIndex;
        if (even) {
            if (startIndex % 2 != 0)
                updatedStartIdx++;
        } else {
            if (startIndex % 2 == 0)
                updatedStartIdx++;
        }
        return updatedStartIdx;
    }


    public void run() {
        int i = startIndex;
        while(i < endIndex) {

        }
    }

}

class Printer {

}
