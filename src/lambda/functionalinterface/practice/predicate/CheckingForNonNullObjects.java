package lambda.functionalinterface.practice.predicate;

//Create a Predicate that checks whether an object is not null.

import lambda.functionalinterface.practice.predicate.citizens.Citizen;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class CheckingForNonNullObjects {
    public static void main(String[] args) {
        List<Citizen> objects = List.of(
                new Citizen("Maks", 38)
        );
        Predicate<Citizen> objectPredicate = Objects::nonNull;
        System.out.println(checkObjectsList(objects, objectPredicate));
    }

    public static List<Citizen> checkObjectsList(List<Citizen> objectList, Predicate<Citizen> function) {
        return objectList.stream()
                .filter(function)
                .toList();
    }
}
