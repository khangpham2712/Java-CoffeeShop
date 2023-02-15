package mycoffeeshop.decorator;

import mycoffeeshop.decorator.beverage.Cappuccino;
import mycoffeeshop.decorator.beverage.Expresso;
import mycoffeeshop.decorator.beverage.MatchaTea;
import mycoffeeshop.decorator.beverage.MilkTea;
import mycoffeeshop.decorator.topping.BlackBubble;
import mycoffeeshop.decorator.topping.Cream;
import mycoffeeshop.decorator.topping.WhippedCream;
import mycoffeeshop.decorator.topping.WhiteBubble;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToppingTest {
    private Beverage beverage;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        beverage = null;
    }




    //test MilkTea class with compatible Topping classes
    @Test
    void makeMilkTeaWithWhiteBubble() {
        beverage = new MilkTea();
        beverage = new WhiteBubble(beverage);
        String expectedName = "Milk tea with white bubble";
        float expectedPrice = 55_000F;
        assertEquals(expectedName, beverage.getName());
        assertEquals(expectedPrice, beverage.getPrice());
    }

    @Test
    void makeMilkTeaWithBlackBubble() {
        beverage = new MilkTea();
        beverage = new BlackBubble(beverage);
        String expectedName = "Milk tea with black bubble";
        float expectedPrice = 55_000F;
        assertEquals(expectedName, beverage.getName());
        assertEquals(expectedPrice, beverage.getPrice());
    }




    //test MatchaTea class with compatible Topping classes
    @Test
    void makeMatchaTeaWithWhiteBubble() {
        beverage = new MatchaTea();
        beverage = new WhiteBubble(beverage);
        String expectedName = "Matcha tea with white bubble";
        float expectedPrice = 65_000F;
        assertEquals(expectedName, beverage.getName());
        assertEquals(expectedPrice, beverage.getPrice());
    }

    @Test
    void makeMatchaTeaWithBlackBubble() {
        beverage = new MatchaTea();
        beverage = new BlackBubble(beverage);
        String expectedName = "Matcha tea with black bubble";
        float expectedPrice = 65_000F;
        assertEquals(expectedName, beverage.getName());
        assertEquals(expectedPrice, beverage.getPrice());
    }




    //test Cappuccino class with compatible Topping classes
    @Test
    void makeCappuccinoWithCream() {
        beverage = new Cappuccino();
        beverage = new Cream(beverage);
        String expectedName = "Cappuccino with cream";
        float expectedPrice = 75_000F;
        assertEquals(expectedName, beverage.getName());
        assertEquals(expectedPrice, beverage.getPrice());
    }

    @Test
    void makeCappuccinoWithWhippedCream() {
        beverage = new Cappuccino();
        beverage = new WhippedCream(beverage);
        String expectedName = "Cappuccino with whipped cream";
        float expectedPrice = 75_000F;
        assertEquals(expectedName, beverage.getName());
        assertEquals(expectedPrice, beverage.getPrice());
    }




    //test Expresso class with compatible Topping classes
    @Test
    void makeExpressoWithCream() {
        beverage = new Expresso();
        beverage = new Cream(beverage);
        String expectedName = "Expresso with cream";
        float expectedPrice = 75_000F;
        assertEquals(expectedName, beverage.getName());
        assertEquals(expectedPrice, beverage.getPrice());
    }

    @Test
    void makeExpressoWithWhippedCream() {
        beverage = new Expresso();
        beverage = new WhippedCream(beverage);
        String expectedName = "Expresso with whipped cream";
        float expectedPrice = 75_000F;
        assertEquals(expectedName, beverage.getName());
        assertEquals(expectedPrice, beverage.getPrice());
    }




    //test beverage with multiple add-ons
    @Test
    void makeMilkTeaWithDoubleWhiteBubbleAndBlackBubble() {
        beverage = new MilkTea();
        beverage = new WhiteBubble(beverage);
        beverage = new WhiteBubble(beverage);
        beverage = new BlackBubble(beverage);
        String expectedName = "Milk tea with white bubble with white bubble with black bubble";
        float expectedPrice = 75_000F;
        assertEquals(expectedName, beverage.getName());
        assertEquals(expectedPrice, beverage.getPrice());
    }

    @Test
    void makeExpressoWithCreamAndWhippedCream() {
        beverage = new Expresso();
        beverage = new Cream(beverage);
        beverage = new WhippedCream(beverage);
        String expectedName = "Expresso with cream with whipped cream";
        float expectedPrice = 85_000F;
        assertEquals(expectedName, beverage.getName());
        assertEquals(expectedPrice, beverage.getPrice());
    }

    @Test
    void makeCappuccinoWithDoubleCream() {
        beverage = new Cappuccino();
        beverage = new Cream(beverage);
        beverage = new Cream(beverage);
        String expectedName = "Cappuccino with cream with cream";
        float expectedPrice = 85_000F;
        assertEquals(expectedName, beverage.getName());
        assertEquals(expectedPrice, beverage.getPrice());
    }
}