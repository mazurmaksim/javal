package threads.tasks.restaurant;

public enum Ingredient {
    TOMATO("Tomato"),
    ONION("Onion"),
    CHEESE("Cheese"),
    CHICKEN("Chicken"),
    LETTUCE("Lettuce"),
    CAESAR_DRESSING("Caesar Dressing"),
    PARMESAN("Parmesan"),
    SPAGHETTI("Spaghetti"),
    GARLIC("Garlic"),
    MINCED_MEAT("Minced Meat"),
    NORI("Nori"),
    RICE("Rice"),
    SOY_SAUCE("Soy Sauce"),
    GREEK_NUTS("Greek Nuts"),
    COCONUT_MILK("Coconut Milk"),
    RED_CURRY_PASTE("Red Curry Paste"),
    BASIL("Basil"),
    SUSHI_RICE("Sushi Rice"),
    PIZZA_DOUGH("Pizza Dough"),
    SALMON("Salmon");

    private final String displayName;

    Ingredient(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
