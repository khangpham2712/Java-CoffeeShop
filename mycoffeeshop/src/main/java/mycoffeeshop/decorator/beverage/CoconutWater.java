package mycoffeeshop.decorator.beverage;

import mycoffeeshop.controller.menu.Drinks;
import mycoffeeshop.decorator.Beverage;

public class CoconutWater implements Beverage {
    private String name;
    private float price;
    private byte[] compatible;

    public CoconutWater() {
        name = Drinks.COCONUT_WATER.getName();
        price = Drinks.COCONUT_WATER.getPrice();
        compatible = Drinks.COCONUT_WATER.getCompatible();
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
