package threads.tasks.numbers;

import java.util.ArrayList;
import java.util.List;

public class NumberPrinter {

    private final Object lock = new Object();

    private List<Integer> numbers = new ArrayList<>();

    public NumberPrinter(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void printEven() {
        synchronized (lock) {
            numbers.forEach(number -> {
                System.out.println();
                if (number % 2 == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(number);
                }
            });
        }
    }

    public void printOdd() {
        synchronized (lock) {

        }
    }
}
