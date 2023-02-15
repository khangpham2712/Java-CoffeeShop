package mycoffeeshop.factory;

import mycoffeeshop.decorator.Beverage;
import mycoffeeshop.decorator.beverage.*;
import mycoffeeshop.decorator.topping.BlackBubble;
import mycoffeeshop.decorator.topping.Cream;
import mycoffeeshop.decorator.topping.WhippedCream;
import mycoffeeshop.decorator.topping.WhiteBubble;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class BeverageFactoryTest {

    @Mock
    private Beverage beverage;

    @BeforeEach
    void setUp() {
        beverage = mock(Beverage.class);
    }

    @AfterEach
    void tearDown() {
        beverage = null;
    }




    @ParameterizedTest
    @ValueSource(bytes = {(byte)1, (byte)2, (byte)3, (byte)4, (byte)5})
    void getBeverage(byte option) {
        beverage = BeverageFactory.getBeverage(option);
        assertNotNull(beverage);
    }

    @ParameterizedTest
    @ValueSource(bytes = {(byte)1, (byte)2, (byte)3, (byte)4})
    void getBeverageWithToppings(byte option) {
        beverage = BeverageFactory.getBeverageWithToppings(option, beverage);
        assertNotNull(beverage);
    }




    //test getBeverage method
    @Test
    void getCappuccino() {
        Beverage beverage = BeverageFactory.getBeverage((byte) 3);
        assertTrue(beverage instanceof Cappuccino);
        String expected = "Cappuccino";
        assertEquals(expected, beverage.getName());
    }

    @Test
    void getCoconutWater() {
        Beverage beverage = BeverageFactory.getBeverage((byte) 5);
        assertTrue(beverage instanceof CoconutWater);
        String expected = "Coconut water";
        assertEquals(expected, beverage.getName());
    }

    @Test
    void getMatchaTea() {
        Beverage beverage = BeverageFactory.getBeverage((byte) 2);
        assertTrue(beverage instanceof MatchaTea);
        String expected = "Matcha tea";
        assertEquals(expected, beverage.getName());
    }




    //test getBeverageWithToppings method
    @Test
    void getCappuccinoWithCream() {
        Beverage beverage = BeverageFactory.getBeverageWithToppings((byte) 3, new Cappuccino());
        assertTrue(beverage instanceof Cream);
        String expected = "Cappuccino with cream";
        assertEquals(expected, beverage.getName());
    }

    @Test
    void getExpressoWithWhippedCream() {
        Beverage beverage = BeverageFactory.getBeverageWithToppings((byte) 4, new Expresso());
        assertTrue(beverage instanceof WhippedCream);
        String expected = "Expresso with whipped cream";
        assertEquals(expected, beverage.getName());
    }

    @Test
    void getMilkTeaWithWhiteBubble() {
        Beverage beverage = BeverageFactory.getBeverageWithToppings((byte) 1, new MilkTea());
        assertTrue(beverage instanceof WhiteBubble);
        String expected = "Milk tea with white bubble";
        assertEquals(expected, beverage.getName());
    }
}