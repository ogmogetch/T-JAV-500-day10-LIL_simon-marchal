public class Drink implements Food{
    private float price;
    private int calories;
    private boolean aCan = false;
    public Drink(float price, int calories, boolean eCan) {
        this.price = price;
        this.calories = calories;
        this.aCan = eCan;
    }
    public float getPrice() {
        return price;
    }
    public int getCalories() {
        return calories;
    }
    public boolean isACan() {
        return aCan;
    }
}
