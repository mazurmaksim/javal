package threads.tasks.restaurant;

import java.util.List;

public class Customer {
    int tableNumber;
    List<Item> items;

    public Customer(int tableNumber, List<Item> items) {
        this.tableNumber = tableNumber;
        this.items = items;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
