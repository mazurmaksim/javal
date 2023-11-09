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
                    lock.wait();
                    System.out.println(" { Waiter serving table }");
                    Thread.sleep(1000);
                    System.out.println("{Waiter served this customer...}");
                    lock.notify();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}