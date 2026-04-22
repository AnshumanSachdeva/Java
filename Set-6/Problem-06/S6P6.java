// Write a Java program to demonstrate the concept of race condition and solve it using synchronization.
class Counter {
    public int count = 0;

    public synchronized void incriment() {
        count++;

    }

    public synchronized int get() {
        return count;

    }
}

public class S6P6 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                counter.incriment();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                counter.incriment();
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("error: " + e);
        }

        System.out.println("Final count: " + counter.get());
    }
}
