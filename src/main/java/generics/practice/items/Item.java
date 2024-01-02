package generics.practice.items;

import generics.practice.items.races.Races;

public class Item {
    private Long id;
    private String itemName;
    private Races race;
    public Item(Long id, String itemName, Races race) {
        this.id = id;
        this.itemName = itemName;
        this.race = race;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Races getRace() {
        return race;
    }
}
