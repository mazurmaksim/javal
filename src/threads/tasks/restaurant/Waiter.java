package threads.tasks.restaurant;

import java.util.HashMap;

public class Waiter {
    private final Object lock;

    public Waiter(Object lock) {
        this.lock = lock;
    }

    public void serveFood() {
        synchronized (lock) {
            while (true) {
                try {
                    lock.wait(600);
                    System.out.println("Waiter - Yes please");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                lock.notify();
                System.out.println(" Waiter is free ");
            }
        }
    }
}
