package mycoffeeshop.decorator.topping;

import mycoffeeshop.controller.menu.AddOns;
import mycoffeeshop.decorator.Beverage;
import mycoffeeshop.decorator.Topping;

public class WhippedCream implements Topping {
    private Beverage beverage;
    private String name;
    private float price;

    public WhippedCream(Beverage beverage) {
        this.beverage = beverage;
        name = AddOns.WHIPPED_CREAM.getName();
        price = AddOns.WHIPPED_CREAM.getPrice();
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
