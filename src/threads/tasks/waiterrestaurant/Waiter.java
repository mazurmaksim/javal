package threads.tasks.waiterrestaurant;

public class Waiter {
    private final Object lock;

    public Waiter(Object lock) {
        this.lock = lock;
    }

    public void serveFood() {
        synchronized (lock) {
            for (int i = 1; i <= 4 ; i++) {
                try {
                    lock.wait(600);
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