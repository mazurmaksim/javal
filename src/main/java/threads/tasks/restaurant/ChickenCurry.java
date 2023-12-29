package threads.tasks.restaurant;

import java.util.Arrays;
import java.util.List;

public class ChickenCurry implements Item {
    @Override
    public List<Ingredient> getDish() {
        return Arrays.asList(
                Ingredient.CHICKEN,
                Ingredient.COCONUT_MILK,
                Ingredient.ONION,
                Ingredient.RED_CURRY_PASTE,
                Ingredient.BASIL
        );
    }
}
