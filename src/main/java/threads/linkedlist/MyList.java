package threads.linkedlist;

public interface MyList<E> extends Iterable<E> {
    boolean add(E e);
    void delete(E e);
    E get();
    int size();
    void update();
}
