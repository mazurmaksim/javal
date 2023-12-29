package threads.linkedlist;

public class MyLinkedList<E> implements MyList<E> {
    Node<E> node;

    public void add(E e) {
        if(node == null ) {
            node = new Node<>(e, null);
        } else {
            node.next = new Node<>(e, node.next);
        }
    }

    @Override
    public void remove(Object e) {
        for (Node<E> x = node; x != null; x = x.next) {
            if(x.data.equals(e)) {
//                unlink(x);
            }
        }
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
