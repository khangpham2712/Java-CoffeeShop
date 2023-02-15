package mycoffeeshop.decorator.beverage;

import mycoffeeshop.controller.menu.Drinks;
import mycoffeeshop.decorator.Beverage;

public class Expresso implements Beverage {
    private String name;
    private float price;
    private byte[] compatible;

    public Expresso() {
        name = Drinks.EXPRESSO.getName();
        price = Drinks.EXPRESSO.getPrice();
        compatible = Drinks.EXPRESSO.getCompatible();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public byte[] getCompatible() {
        return compatible;
    }
}
