package lambda.chaining.tasks;


import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

//Create a list of integers and solve the following tasks using functional programming:
//
//        Find the sum of squares of all numbers greater than 5.
//        Multiply all numbers by 2.
//        Filter only even numbers.
public class ListOfIntegers {
    private static final List<Integer> integerList = List.of(6,6,15, 89, 14);

    public static void main(String[] args) {
//        1 task  Find the sum of squares of all numbers greater than 5.
        Predicate<Integer> predicate = num-> num > 5;
        Function<Predicate<Integer>, List<Integer>> greaterThenFiveInTheList = getListByPredicate(integerList);
        Function<Predicate<Integer>, Double> result = greaterThenFiveInTheList.andThen(integers -> pow().apply(integers));
        System.out.println("Sum of squares of all numbers greater than 5 is: " + result.apply(predicate));

//        2 task Multiply all numbers by 2
        Function<List<Integer>, List<Integer>> multiplyedToTwo = multiplyListToTwo();
        System.out.println("Multiple all numbers by 2 " + multiplyedToTwo.apply(integerList));

//        3 Filter only even numbers.
        Predicate<Integer> predicate1 = num -> num % 2 == 0;
        Function<Predicate<Integer>, List<Integer>> listWithEvenNumbers = getListByPredicate(integerList);
        System.out.println("Only even numbers " + listWithEvenNumbers.apply(predicate1));
    }

    private static Function<List<Integer>, List<Integer>> multiplyListToTwo() {
        return list -> list.stream()
                .map(integer -> integer * 2)
                .toList();
    }

    public static Function<Predicate<Integer>, List<Integer>> getListByPredicate(List<Integer> list) {
          return (function) -> list.stream()
                .filter(function)
                .toList();
    }

    public static Function<List<Integer>, Double> pow() {
        return (list) -> {
            double result = 0;
            for (Integer num: list ) {
                result +=  Math.pow(num,2);
            }
            return result;
        };
    }
}