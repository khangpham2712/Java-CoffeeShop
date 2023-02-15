package mycoffeeshop.decorator.topping;

import mycoffeeshop.controller.menu.AddOns;
import mycoffeeshop.decorator.Beverage;
import mycoffeeshop.decorator.Topping;

public class Cream implements Topping {
    private Beverage beverage;
    private String name;
    private float price;

    public Cream(Beverage beverage) {
        this.beverage = beverage;
        name = AddOns.CREAM.getName();
        price = AddOns.CREAM.getPrice();
    }

    @Override
    public String getName() {
        return beverage.getName() + " with " + name.toLowerCase();
    }

    @Override
    public float getPrice() {
        return beverage.getPrice() + price;
    }
}
