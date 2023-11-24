package lambda.functionalinterface.practice.consumer;

import lambda.functionalinterface.practice.predicate.citizens.Citizen;

import java.util.List;
import java.util.function.Consumer;

//  Create a list of objects (e.g., user objects) and use a Consumer to update specific properties for each object.
public class UpdatingValuesInList {
    public static void main(String[] args) {
        List<Citizen> citizens = List.of(
                new Citizen("Maks", 38),
                new Citizen("Petro", 19)
        );

        Consumer<Citizen> consumer = c -> c.setAge(15);

        changeAgeByConsumer(citizens, consumer);
        System.out.println(citizens);
    }

    private static void changeAgeByConsumer(List<Citizen> citizens, Consumer<Citizen> consumer) {
        citizens.forEach(consumer);
    }
}
