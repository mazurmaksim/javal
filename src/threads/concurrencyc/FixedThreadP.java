package threads.concurrencyc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class TaskPool implements Runnable {
    private int id;

    public TaskPool(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Task with id " + id + "is in work - thread id: " + Thread.currentThread().getId());
        long duration = (long) Math.random() * 5;

        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class FixedThreadP {
    public static void main(String[] args) {
        // it is a single thread that will execute the task sequentially
        // so one after another
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5 ; i++) {
            executor.execute(new Task(i));
            // we have to shut down the executor
        }
        executor.shutdown();
    }
}
