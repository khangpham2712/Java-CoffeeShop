package mycoffeeshop.singleton;

import mycoffeeshop.decorator.Beverage;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Beverage> cart = new ArrayList<>();
    private static Cart instance = new Cart();

    private Cart() {
    }

    public void addNewBeverage(Beverage beverage) {
        cart.add(beverage);
    }

    public void clearCart() {
        cart.clear();
    }

    public static Cart getInstance() {
        return instance;
    }

    public List<Beverage> getCart() {
        return cart;
    }
}
