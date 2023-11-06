public abstract class Bread implements Food{
    int calories, bakingTime;
    float price;

    public Bread(int calories, int bakingTime, float price) {
        this.price = price;
        this.calories = calories;
        this.bakingTime = bakingTime;
    }


    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    public int getBakingTime() {
        return bakingTime;
    }
}
