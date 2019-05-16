package Test;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {
    static int count = 0;
    static int arrayCapacity = 20;
    static List<Integer> elements = new ArrayList<>(arrayCapacity);

    public static void main(String[] args) {
        try {
            new ProducerConsumer().producerConsumer();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    private void producerConsumer() throws InterruptedException{

        Thread producer = new Thread(() -> {
            try {
            produce();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        });

        Thread consumer = new Thread(() -> {
            try {
                consume();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

    }

    private void produce() throws InterruptedException {
        while (true) {
            synchronized (this) {
                if (elements.size() == arrayCapacity) {
                    System.out.println("Producer waiting");
                    wait();
                }
                System.out.println("produced " + ++count);
                elements.add(count);
                System.out.println(elements);
                notify();
                Thread.sleep(1000);
            }
        }
    }


    private void consume() throws InterruptedException{
        while (true) {
            synchronized (this) {
                if (elements.size() == 0) {
                    System.out.println("Producer waiting");
                    wait();
                }
                System.out.println("consumed " + elements.remove(elements.size()-1));
                System.out.println(elements);
                notify();
                Thread.sleep(1000);
            }
        }
    }
}
