package mycoffeeshop.singleton;

import mycoffeeshop.decorator.Beverage;
import mycoffeeshop.decorator.beverage.CoconutWater;
import mycoffeeshop.decorator.beverage.Expresso;
import mycoffeeshop.decorator.beverage.MilkTea;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }




    @Test
    void addNewBeverage() {
        Cart cart = Cart.getInstance();
        cart.addNewBeverage(new Expresso());
        cart.addNewBeverage(new CoconutWater());
        assertEquals(2, cart.getCart().size());
        cart.clearCart();
    }

    @Test
    void clearCart() {
        Cart cart = Cart.getInstance();
        cart.addNewBeverage(new Expresso());
        cart.addNewBeverage(new CoconutWater());
        cart.clearCart();
        assertEquals(0, cart.getCart().size());
        cart.clearCart();
    }

    @Test
    void getInstance() {
        Cart cart = Cart.getInstance();
        assertTrue(cart instanceof Cart);
        cart.clearCart();
    }

    @Test
    void getCart() {
        Cart cart = Cart.getInstance();
        cart.addNewBeverage(new Expresso());
        cart.addNewBeverage(new CoconutWater());
        cart.addNewBeverage(new MilkTea());
        List<Beverage> list = cart.getCart();
        assertEquals(3, list.size());
        cart.clearCart();
    }
}