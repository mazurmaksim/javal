package main.java.lambda.functionalinterface.practice.predicate;

import java.util.function.Predicate;

//  Create a Predicate that checks whether a number is even.
public class CheckingForEvenNumbers {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (num) -> num % 2 == 0;
        System.out.println(isEvenNumber(10, predicate));
    }

    public static boolean isEvenNumber(Integer num, Predicate<Integer> predicate) {
        return predicate.test(num);
    }
}
