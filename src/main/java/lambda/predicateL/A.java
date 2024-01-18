package lambda.predicateL;

import java.util.List;
import java.util.function.Predicate;

// This example demonstrate how works Predicate
public class A {
    private Integer value;

    public A(Integer value) {
        this.value = value;
    }

    public A() {
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

class FactoryA {

    public List<A> someFunction(Predicate<A> function, List<Integer> list) {
        // Map values regarding predicate and create List A objects
        return list.stream()
                .map(A::new)
                .filter(function)
                .toList();
    }
}