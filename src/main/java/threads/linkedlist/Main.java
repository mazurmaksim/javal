package threads.linkedlist;

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

        list.delete("Remove this");
        list.delete("And remove this");
        System.out.println(list);
    }
}
