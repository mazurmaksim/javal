package products;

import java.util.ArrayList;
import java.util.List;

public class Store<T extends Product> {
    T product;

    List<T> list = new ArrayList<>();

    public void addProduct(T t) {
        list.add(t);
    }

    public void removeProduct(T element) {
        list.remove(element);
        System.out.println("Product removed ");
    }

    public T getProduct(T element) {
        return list.contains(element) ? element : null;
    }
}
