package lambda.chaining.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Create a list of strings and perform the following tasks:
//
//        Convert each string to uppercase.
//        Filter strings with more than 5 characters.
//        Concatenate the filtered strings into one string with a ", " separator.
//        Find the length of each string and create a list of lengths.
public class CollectionsOfStrings {

    private static List<String> strings = List.of("This", "string", "list");

    public static void main(String[] args) {
//        1  Convert each string to uppercase.
        Function<List<String>, List<String>> resultFunction = convertListToUpperCase();
        System.out.println(resultFunction.apply(strings));

//        2 Filter strings with more than 5 characters.
        Function<List<String>, List<String>> resultMoreThenFive = getMoreThenFive();
        System.out.println(resultMoreThenFive.apply(strings));

//        3 Concatenate the filtered strings into one string with a ", " separator.
        String resultWithComma = resultFunction.andThen(resultFunction1 -> resultFunction1.stream()
                .map(s -> s += ", ")
                .collect(Collectors.joining())
        ).apply(strings);
        System.out.println(resultWithComma);

//        4 Find the length of each string and create a list of lengths.
        Function<List<String>, List<Integer>> lengthsFunc = getLengthsList();
        System.out.println(lengthsFunc.apply(strings));

    }

    private static Function<List<String>, List<Integer>> getLengthsList() {
        return list-> {
            List<Integer> result = new ArrayList<>();
            for (String str: list) {
                result.add(str.length());
            }
            return result;
        };
    }

    private static Function<List<String>, List<String>> getMoreThenFive() {
        Predicate<String> predicate = str -> str.length() > 5;
        return stringList-> stringList.stream()
                .filter(predicate)
                .toList();
    }

    private static Function<List<String>, List<String>> convertListToUpperCase() {
        return stringList-> stringList.stream()
                .map(String::toUpperCase)
                .toList();
    }
}
