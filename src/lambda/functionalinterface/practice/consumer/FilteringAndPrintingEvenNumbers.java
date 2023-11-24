package lambda.functionalinterface.practice.consumer;

import java.util.List;
import java.util.function.Consumer;

//  Create a list of numbers and use a Consumer to print only
//  the even numbers to the console.
public class FilteringAndPrintingEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = List.of(15, 47, 87, 9, 3, 2, 1, 23, 54);
        Consumer<Integer> consumer = (n) -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        };
        getEvenNumbers(list, consumer);
    }

    public static void getEvenNumbers(List<Integer> numbers, Consumer<Integer> consumer) {
        numbers.forEach(consumer);
    }
}
