package threads.linkedlist;

import java.util.Iterator;

public class MyLinkedList<E> implements MyList<E> {
    Node<E> node;

    public boolean add(E e) {
        if(node == null ) {
            node = new Node<>(e, null);
        } else {
            node.next = new Node<>(e, node.next);
        }
        return true;
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
    public void delete(Object e) {
        for (Node<E> x = node; x != null; x = x.next) {
            if(x.data.equals(e)) {
//                unlink(x);
            }
        }
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

//    private void unlink(Node<E> x) {
//        Node<E> n = new Node<>(null, null);
//        for (Node<E> nodes = node; nodes != null; nodes = nodes.next) {
//            if(!nodes.data.equals(x.data)) {
//               add(nodes.data, nodes.next);
//            }
//        }
//        node = n;
//    }

}
