package threads.tasks.restaurant;

import java.util.List;

public class Dish {
    private String name;
    private final List<Ingredient> ingredients;
    private final int preparationTime;

    public Dish(String name, List<Ingredient> ingredients, int preparationTime) {
        this.name = name;
        this.ingredients = ingredients;
        this.preparationTime = preparationTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public int getPreparationTime() {
        return preparationTime;
    }
}
