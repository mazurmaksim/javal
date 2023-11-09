package threads.tasks.restaurant;

import java.util.List;

public class Customer {

    private final Object lock;
    private Integer tableNumber;
    List<String> selectedItems;

    public Customer(Object lock, Integer tableNumber, List<String> selectedItems) {
        this.lock = lock;
        this.tableNumber= tableNumber;
        this.selectedItems = selectedItems;
    }

    public void placeOrder() {
        synchronized (lock) {
            while (true) {

                try {
                    System.out.println("Customer - Place Order to table Number " + tableNumber + " " + selectedItems);
                    Thread.sleep(500);
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "tableNumber=" + tableNumber +
                ", selectedItems=" + selectedItems +
                '}';
    }
}