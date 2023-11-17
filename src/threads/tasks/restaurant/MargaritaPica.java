package threads.tasks.restaurant;

import java.util.Arrays;
import java.util.List;

public class MargaritaPica implements Item {

    @Override
    public List<Ingredient> getDish() {
        return Arrays.asList(
                Ingredient.PIZZA_DOUGH,
                Ingredient.TOMATO,
                Ingredient.CHEESE,
                Ingredient.BASIL
        );
    }
}
