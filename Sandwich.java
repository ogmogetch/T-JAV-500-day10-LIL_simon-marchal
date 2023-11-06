import java.util.List;

public abstract class Sandwich implements Food {
    private float price;
    private int calories;
    private boolean vegetarian;
    private List<String> ingredients;

    public Sandwich(float price, int calories, boolean vegetarian, List<String> ingredients) {
        this.price = price;
        this.calories = calories;
        this.vegetarian = vegetarian;
        this.ingredients = ingredients;
    }

    public float getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
