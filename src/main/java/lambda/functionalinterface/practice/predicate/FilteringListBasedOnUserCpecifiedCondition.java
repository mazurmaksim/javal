package lambda.functionalinterface.practice.predicate;


import lambda.functionalinterface.practice.predicate.citizens.Citizen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
//    Write a program that allows the user to input a filtering condition,
//    and use a Predicate to filter a list of objects based on that condition.
public class FilteringListBasedOnUserCpecifiedCondition {
    public static void main(String[] args) {
        List<Citizen> citizens = List.of(
                new Citizen("Vasyl", 15),
                new Citizen("Petro", 10),
                new Citizen("Illya", 3)
        );
        int num;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            num = Integer.parseInt(reader.readLine());
            System.out.println(getFilterFromKeyboard(num, citizens));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Citizen> getFilterFromKeyboard(Integer num, List<Citizen> list) {
        Predicate<Citizen> filter = ct -> Objects.equals(ct.getAge(), num);
        return list.stream()
                .filter(filter)
                .toList();
    }
}
