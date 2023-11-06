import java.util.HashMap;
import java.util.Map;

public class Stock {
    private Map<Class<? extends Food>, Integer> stockMap;

public Stock() {
        stockMap = new HashMap<>();
        //Drinks
        stockMap.put(AppleSmoothie.class, 5);
        stockMap.put(Coke.class, 5);
        //Bread
        stockMap.put(FrenchBaguette.class, 5);
        stockMap.put(SoftBread.class, 5);
        //Sandwiches
        stockMap.put(Panini.class, 5);
        stockMap.put(HamSandwich.class, 5);
        //Desserts
        stockMap.put(Cookie.class, 5);
        stockMap.put(CheeseCake.class, 5);
    }

    public int getNumberOf(Class<? extends Food> foodType) {
        return stockMap.getOrDefault(foodType, 0);
    }

    public boolean add(Class<? extends Food> foodType) {
        if (!stockMap.containsKey(foodType)) {
            throw new NoSuchFoodException("No such food type: " + foodType.getSimpleName());
        }

        int count = stockMap.get(foodType);
        stockMap.put(foodType, count + 1);
        return true;
    }

    public boolean remove(Class<? extends Food> foodType) {
        if (!stockMap.containsKey(foodType)) {
            throw new NoSuchFoodException("No such food type: " + foodType.getSimpleName());
        }

        int count = stockMap.get(foodType);
        if (count > 0) {
            stockMap.put(foodType, count - 1);
            return true;
        }
        return false;
    }

}
