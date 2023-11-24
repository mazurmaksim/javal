package lambda.functionalinterface.practice.consumer;

import java.util.List;
import java.util.function.Consumer;

//  Create a list of strings and use a Consumer to print
//  the length of each string to the console.
public class TransformationAndPrintingTheLengthOfStrings {
    public static void main(String[] args) {
        List<String> list = List.of("String1", "Java", "Help", "Car");
        Consumer<String> consumer = s -> System.out.println(s.length());
        getLength(list, consumer);
    }

    private static void getLength(List<String> list, Consumer<String> consumer) {
        list.forEach(consumer);
    }
}
