package threads.tasks.restaurant;

import java.util.List;

public class Customer {

    private final Object lock;
    private Integer tableNumber;
    List<String> selectedItems;

    public Customer(Object lock, Integer tableNumber, List<String> selectedItems) {
        this.lock = lock;
        this.tableNumber = tableNumber;
        this.selectedItems = selectedItems;
    }

    public void placeOrder() {
        synchronized (lock) {
            try {
                Thread.sleep(900);
                System.out.println("[ Waiting for a Waiter... ]");
                System.out.println("Customer - Place Order to table Number " + tableNumber + " " + selectedItems);
                lock.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
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
