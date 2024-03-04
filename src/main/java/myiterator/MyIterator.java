package myiterator;


import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {

    private final T[] integers;
    private int counter = 0;

    public MyIterator(T[] integers) {
        this.integers = integers;
    }

    @Override
    public boolean hasNext() {
        return counter < integers.length;
    }

    @Override
    public T next() {
        return integers[counter++];
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        MyIterator<Integer> iterator = new MyIterator<>(arr);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
