package collectioneasy;

import threads.linkedlist.MyList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyArrayList<E> implements MyList<E> {
    private E[] arr;
    private List<String> lst = new ArrayList<>();
    public MyArrayList() {
        arr = (E[]) new Object();
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public void delete(Object o) {

    }

    @Override
    public E get() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void update() {

    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}

