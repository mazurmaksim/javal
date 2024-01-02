package generics.practice.items;

import generics.practice.items.races.Gnome;
import generics.practice.items.races.Races;

public class Main {
    public static void main(String[] args) {
        Inventory<Item> gnomeInventory = new Inventory<>();
        Item sword = new Sword(1L, "sword_item", "Excalibur", 50, 3.5, "Steel", 75.0, new Races(1L, "Gnomes"));
        gnomeInventory.addItem(sword);
        Gnome<Inventory<Item>> gnome = new Gnome<>(1L, "Gnorman", 50, "Red", true);
        gnome.setInventory(gnomeInventory);
        gnome.getInventory().showInventory();
    }
}
