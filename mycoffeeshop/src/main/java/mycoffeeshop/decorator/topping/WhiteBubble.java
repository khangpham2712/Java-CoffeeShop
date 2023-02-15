package mycoffeeshop.decorator.topping;

import mycoffeeshop.controller.menu.AddOns;
import mycoffeeshop.decorator.Beverage;
import mycoffeeshop.decorator.Topping;

public class WhiteBubble implements Topping {
    private Beverage beverage;
    private String name;
    private float price;

    public WhiteBubble(Beverage beverage) {
        this.beverage = beverage;
        name = AddOns.WHITE_BUBBLE.getName();
        price = AddOns.WHITE_BUBBLE.getPrice();
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
