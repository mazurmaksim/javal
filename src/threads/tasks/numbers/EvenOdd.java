package threads.tasks.numbers;


//Task: Ordering Number Output
//
//        Create a Java program with two threads: one for printing even numbers and another for printing odd numbers.
//        Ensure that the numbers are printed in ascending order.
//
//        Create a class called NumberPrinter with two methods: printEven() for printing even
//        numbers and printOdd() for printing odd numbers.
//        Create two threads (one for even and one for odd numbers) that invoke the respective
//        methods from the NumberPrinter class.
//        Use the wait and notify mechanisms to guarantee that even and odd numbers are printed in ascending order.
//        Run the program and verify that the numbers are printed in the correct order.
//
//        This task will allow you to interact with a shared resource (number output) and use
//        wait and notify to ensure the correct order of output.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EvenOdd {
    private static final List<Integer> numbersToPrint = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            numbersToPrint.add(new Random(i).nextInt());
        }

        NumberPrinter printer = new NumberPrinter(numbersToPrint);
        Thread nuPrinter = new Thread();
    }
}
