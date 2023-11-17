package threads.tasks.restaurant;

import java.util.Arrays;
import java.util.List;

public class SalmonSushi implements Item {

    @Override
    public List<Ingredient> getDish() {
        return Arrays.asList(
                Ingredient.RICE,
                Ingredient.SALMON,
                Ingredient.NORI,
                Ingredient.SOY_SAUCE
        );
    }
}
