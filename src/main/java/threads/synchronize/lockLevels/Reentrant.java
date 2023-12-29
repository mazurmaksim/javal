package main.java.threads.synchronize.lockLevels;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Reentrant {

    private static int counter = 0;
    private static final Lock lock = new ReentrantLock();

    public static void increment() {
        lock.lock();

        try {
            for (int i = 0; i < 10000; i++) {
                counter++;
            }
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(Reentrant::increment);
        Thread t2 = new Thread(Reentrant::increment);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter);
    }
}
