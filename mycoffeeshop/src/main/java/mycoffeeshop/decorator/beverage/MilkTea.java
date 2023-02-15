package mycoffeeshop.decorator.beverage;

import mycoffeeshop.controller.menu.Drinks;
import mycoffeeshop.decorator.Beverage;

public class MilkTea implements Beverage {
    private String name;
    private float price;
    private byte[] compatible;

    public MilkTea() {
        name = Drinks.MILK_TEA.getName();
        price = Drinks.MILK_TEA.getPrice();
        compatible = Drinks.MILK_TEA.getCompatible();
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
