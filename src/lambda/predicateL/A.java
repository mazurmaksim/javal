package lambda.predicateL;

import java.util.List;
import java.util.function.Predicate;

// This example demonstrate how works Predicate
public class A {
    private final Integer value;

    public A(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "A{" +
                "value='" + value + '\'' +
                '}';
    }
}

class Main {
    private static final List<Integer> list = List.of(1,2,3,4,5,85,69,52,45);

    public static void someFunction(Predicate<A> function) {
        // Map values regarding predicate and create List A objects
        List<A> aList = list.stream()
                .map(A::new)
                .filter(function)
                .toList();
        System.out.println(aList);
    }

    public static void main(String[] args) {
        // Get values regarding predicate condition
        // Should be all values <= 3
        someFunction(a -> a.getValue() <= 3);
    }
}