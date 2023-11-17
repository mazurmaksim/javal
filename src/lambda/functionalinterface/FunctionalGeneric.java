package lambda.functionalinterface;

@FunctionalInterface
public interface FunctionalGeneric<T, R> {
    R execute(T t);
}
