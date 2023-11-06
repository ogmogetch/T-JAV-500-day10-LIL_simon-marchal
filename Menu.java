public abstract class Menu<D extends Drink, M extends Food>{
    private D drink;
    private M meal;
    public Menu(D drink, M meal) {
        this.drink = drink;
        this.meal = meal;
    }
    public D getDrink() {
        return drink;
    }
    public M getMeal() {
        return meal;
    }

    public float getPrice() {
        float total = drink.getPrice() + meal.getPrice();
        return total - (total * 0.1f);
    }
}
