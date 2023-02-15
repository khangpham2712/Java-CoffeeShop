package mycoffeeshop.factory;

import mycoffeeshop.decorator.Beverage;
import mycoffeeshop.decorator.beverage.*;
import mycoffeeshop.decorator.topping.BlackBubble;
import mycoffeeshop.decorator.topping.Cream;
import mycoffeeshop.decorator.topping.WhippedCream;
import mycoffeeshop.decorator.topping.WhiteBubble;

public class BeverageFactory {
    public static Beverage getBeverage(byte option) {
        Beverage beverage;
        switch (option) {
            case 1:
                beverage = new MilkTea();
                break;
            case 2:
                beverage = new MatchaTea();
                break;
            case 3:
                beverage = new Cappuccino();
                break;
            case 4:
                beverage = new Expresso();
                break;
            case 5:
                beverage = new CoconutWater();
                break;
            default:
                beverage = null;
        }
        return beverage;
    }

    public static Beverage getBeverageWithToppings(byte option, Beverage beverage) {
        switch (option) {
            case 1:
                beverage = new WhiteBubble(beverage);
                break;
            case 2:
                beverage = new BlackBubble(beverage);
                break;
            case 3:
                beverage = new Cream(beverage);
                break;
            case 4:
                beverage = new WhippedCream(beverage);
                break;
            default:
                beverage = null;
        }
        return beverage;
    }
}
