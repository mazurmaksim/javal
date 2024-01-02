package generics.practice.items.races;

import generics.practice.items.Inventory;
import generics.practice.items.Item;

public class Gnome <T extends Inventory<Item>> extends Races {
    private Long id;
    private String name;
    private int age;
    private String color;
    private boolean hasBeard;
    private T inventory;

    public Gnome(Long id, String name, int age, String color, boolean hasBeard) {
        super(id, name);
        this.id = id;
        this.name = name;
        this.age = age;
        this.color = color;
        this.hasBeard = hasBeard;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRace() {
        return name;
    }

    public void setRace(String race) {
        this.name = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean hasBeard() {
        return hasBeard;
    }

    public void setHasBeard(boolean hasBeard) {
        this.hasBeard = hasBeard;
    }

    public boolean isHasBeard() {
        return hasBeard;
    }

    public Inventory<Item> getInventory() {
        return inventory;
    }

    public void setInventory(T inventory) {
        this.inventory = inventory;
    }
}
