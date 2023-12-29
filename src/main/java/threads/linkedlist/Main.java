package threads.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("Hello");
        list.add("Java");
        list.add("Remove this");
        list.add("sdsd");
        list.add("sdrfre");
        list.add("43er");
        list.add("And remove this");
        list.add("sdvcxv");
        list.add("12121212");

        list.remove("Remove this");
        list.remove("And remove this");
        System.out.println(list);
    }
}
