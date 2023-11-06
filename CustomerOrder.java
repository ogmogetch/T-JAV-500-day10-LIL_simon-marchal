import java.util.ArrayList;
import java.util.List;

public class CustomerOrder {
    private Stock stock;
    private List<Food> orderItems;

    public CustomerOrder(Stock stock) {
        this.stock = stock;
        this.orderItems = new ArrayList<>();
    }

    public boolean addItem(Food food) {
        try {
            stock.remove(food.getClass());
            orderItems.add(food);
            return true;
        } catch (NoSuchFoodException e) {
            return false;
        }
    }

    public boolean removeItem(Food food) {
        if (orderItems.remove(food)) {
            stock.add(food.getClass());
            return true;
        }
        return false;
    }

    public float getPrice() {
        float totalPrice = 0;
        for (Food food : orderItems) {
            totalPrice += food.getPrice();
        }
        return totalPrice;
    }

    public boolean addMenu(Menu<? extends Drink, ? extends Food> menu) {
        try {
            if (stock.getNumberOf(menu.getDrink().getClass()) > 0 && stock.getNumberOf(menu.getMeal().getClass()) > 0) {
                stock.remove(menu.getDrink().getClass());
                stock.remove(menu.getMeal().getClass());
                orderItems.add(menu.getDrink());
                orderItems.add(menu.getMeal());
                return true;
            }
        } catch (NoSuchFoodException e) {
            return false;
        }
        return false;
    }

    public boolean removeMenu(Menu<? extends Drink, ? extends Food> menu) {
        if (orderItems.remove(menu.getDrink()) && orderItems.remove(menu.getMeal())) {
            stock.add(menu.getDrink().getClass());
            stock.add(menu.getMeal().getClass());
            return true;
        }
        return false;
    }

    public void printOrder() {
        System.out.println("Ordered Items:");
        for (Food food : orderItems) {
            System.out.println("- " + food.getClass().getSimpleName());
        }
        System.out.println("Total Price: " + getPrice() + " euros");
    }
}
