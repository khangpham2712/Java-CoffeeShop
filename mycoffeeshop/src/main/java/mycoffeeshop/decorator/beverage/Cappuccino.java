package mycoffeeshop.decorator.beverage;

import mycoffeeshop.controller.menu.Drinks;
import mycoffeeshop.decorator.Beverage;

public class Cappuccino implements Beverage {
    private String name;
    private float price;
    private byte[] compatible;

    public Cappuccino() {
        name = Drinks.CAPPUCCINO.getName();
        price = Drinks.CAPPUCCINO.getPrice();
        compatible = Drinks.CAPPUCCINO.getCompatible();
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
