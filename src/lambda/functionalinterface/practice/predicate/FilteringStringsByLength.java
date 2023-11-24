package lambda.functionalinterface.practice.predicate;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

//    Filtering strings by length:
//    Create a list of strings and use a Predicate to filter those
//    that have a length greater than a certain value.
public class FilteringStringsByLength {


    public static void main(String[] args) {
        List<String> strings = List.of("Hello", "world", "peace", "human", "A", "AA", "BB");
        Predicate<String> predicate = (str) -> str.length() < 3;
        System.out.println(getSortedList(predicate, strings));
    }

    public static List<String> getSortedList(Predicate<String> predicate, List<String> stringList) {
        return stringList.stream()
                .filter(predicate)
                .toList();
    }
}
