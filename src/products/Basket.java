package products;

public interface Basket<T> {
    void add(T t);
    void remove();
    T get();
}
