package lambda.functionalinterface.practice.consumer;

import lambda.functionalinterface.practice.predicate.citizens.Citizen;

import java.util.List;
import java.util.function.Consumer;

//  Create a list of values and use a Consumer to handle exceptions
//  for each element in the list without interrupting the program's execution.
public class HandlingExceptionsForElementsInList {
    public static void main(String[] args) {
        List<Citizen> citizens = List.of(
                new Citizen("Maks", 38),
                new Citizen("Petro", 19)
        );
        Consumer<Citizen> consumer = c -> {
            try {
                System.out.println(c.getAge());
                c.shouldThrowException();
            } catch (RuntimeException e) {
                System.out.println("Error");
            }
        };
        testConsumer(citizens, consumer);
    }

    private static void testConsumer(List<Citizen> citizens, Consumer<Citizen> consumer) {
        citizens.forEach(consumer);
    }
}
