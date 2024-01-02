package generics.practice.items;

import generics.practice.items.races.Races;

public class Sword extends Item {

    private int attackDamage;
    private double weight;
    private String material;
    private double bladeLength;
    private String name;
    private Races race;

    public Sword(Long id, String itemName, String name, int attackDamage, double weight, String material, double bladeLength, Races race) {
        super(id, itemName, race);
        this.attackDamage = attackDamage;
        this.bladeLength = bladeLength;
        this.material = material;
        this.weight = weight;
        this.name = name;
        this.race = race;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(double bladeLength) {
        this.bladeLength = bladeLength;
    }
}
