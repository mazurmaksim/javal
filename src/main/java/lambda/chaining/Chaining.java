package lambda.chaining;

import java.util.function.Function;

public class Chaining {
    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = System.out::println;

        Consumer<String> c3 = s -> {
            c1.accept(s);
            c2.accept(s);
        };
        c3.accept("Hello");

        Consumer<String> c4 = c1.thenAccept(c2);
        c4.accept("Strong");

        Function<Integer, Integer> f1 = s-> s + 2;
        Function<Integer, Integer> f2 = s-> s * 2;

        Function<Integer, Integer> f3 = f1.andThen(f2);
        System.out.println(f3.apply(10));
    }
}
