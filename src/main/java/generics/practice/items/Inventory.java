package generics.practice.items;

import generics.practice.items.races.Races;

import java.util.ArrayList;
import java.util.List;

public class Inventory <T extends Item> {
    List<T> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void showInventory() {
        if (items != null && items.size() > 0)
            for (T item : items) {
                System.out.println("Item: " + item.getItemName() + " " + item.getRace().getRace());
            }
    }
}
