package lambda.functionalinterface.practice.predicate.citizens;

import java.util.List;
import java.util.function.Predicate;

public class CitizenProcessor {
    public static void main(String[] args) {
        List<Citizen> citizens = List.of(
                new Citizen("Vasyl", 15),
                new Citizen("Petro", 10),
                new Citizen("Illya", 3)
        );

        Predicate<Citizen> filter = ct -> ct.age == 3;
        System.out.println(findCitizenByFilter(citizens, filter));
    }

    public static List<Citizen> findCitizenByFilter(List<Citizen> citizenList, Predicate<Citizen> function) {
        return citizenList.stream()
                .filter(function)
                .toList();
    }
}
