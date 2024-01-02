package generics.practice.items.races;

import generics.practice.items.Inventory;
import generics.practice.items.Item;

public class Elf extends Races {
    private Long id;
    private String name;
    private int age;
    private String gender;
    private String profession;
    private Inventory<Item> inventory;

    public Elf(Long id, String name, int age, String gender, String profession, Inventory<Item> inventory) {
        super(id, name);
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.profession = profession;
        this.inventory = inventory;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
