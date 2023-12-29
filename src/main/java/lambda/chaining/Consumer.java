package lambda.chaining;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);


    default Consumer<T> thenAccept(Consumer<T> next) {
        return t-> {
            this.accept(t);
            next.accept(t);
        };
    }
}
