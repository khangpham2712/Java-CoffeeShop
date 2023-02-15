package mycoffeeshop.decorator;

import mycoffeeshop.decorator.beverage.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class BeverageTest {

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }




    //test MilkTea class
    @Test
    void getNameMilkTea() {
        Beverage milkTea1 = new MilkTea();
        MilkTea milkTea2 = new MilkTea();
        String expected = "Milk tea";
        assertEquals(expected, milkTea1.getName());
        assertEquals(expected, milkTea2.getName());
    }

    @Test
    void getPriceMilkTea() {
        Beverage milkTea1 = new MilkTea();
        MilkTea milkTea2 = new MilkTea();
        float expected = 45_000F;
        assertEquals(expected, milkTea1.getPrice());
        assertEquals(expected, milkTea2.getPrice());
    }

    @Test
    void getCompatibleMilkTea() {
        Beverage milkTea1 = new MilkTea();
        MilkTea milkTea2 = new MilkTea();
        byte[] expected = {(byte)1, (byte)2};
        assertTrue(Arrays.equals(milkTea1.getCompatible(), expected));
        assertTrue(Arrays.equals(milkTea2.getCompatible(), expected));
    }




    //test MatchaTea class
    @Test
    void getNameMatchaTea() {
        Beverage matchaTea1 = new MatchaTea();
        MatchaTea matchaTea2 = new MatchaTea();
        String expected = "Matcha tea";
        assertEquals(expected, matchaTea1.getName());
        assertEquals(expected, matchaTea2.getName());
    }

    @Test
    void getPriceMatchaTea() {
        Beverage matchaTea1 = new MatchaTea();
        MatchaTea matchaTea2 = new MatchaTea();
        float expected = 55_000F;
        assertEquals(expected, matchaTea1.getPrice());
        assertEquals(expected, matchaTea2.getPrice());
    }

    @Test
    void getCompatibleMatchaTea() {
        Beverage matchaTea1 = new MatchaTea();
        MatchaTea matchaTea2 = new MatchaTea();
        byte[] expected = {(byte)1, (byte)2};
        assertTrue(Arrays.equals(matchaTea1.getCompatible(), expected));
        assertTrue(Arrays.equals(matchaTea2.getCompatible(), expected));
    }




    //test Cappuccino class
    @Test
    void getNameCappuccino() {
        Beverage cappuccino1 = new Cappuccino();
        Cappuccino cappuccino2 = new Cappuccino();
        String expected = "Cappuccino";
        assertEquals(expected, cappuccino1.getName());
        assertEquals(expected, cappuccino2.getName());
    }

    @Test
    void getPriceCappuccino() {
        Beverage cappuccino1 = new Cappuccino();
        Cappuccino cappuccino2 = new Cappuccino();
        float expected = 65_000F;
        assertEquals(expected, cappuccino1.getPrice());
        assertEquals(expected, cappuccino2.getPrice());
    }

    @Test
    void getCompatibleCappuccino() {
        Beverage cappuccino1 = new Cappuccino();
        Cappuccino cappuccino2 = new Cappuccino();
        byte[] expected = {(byte)3, (byte)4};
        assertTrue(Arrays.equals(cappuccino1.getCompatible(), expected));
        assertTrue(Arrays.equals(cappuccino2.getCompatible(), expected));
    }




    //test Expresso class
    @Test
    void getNameExpresso() {
        Beverage expresso1 = new Expresso();
        Expresso expresso2 = new Expresso();
        String expected = "Expresso";
        assertEquals(expected, expresso1.getName());
        assertEquals(expected, expresso2.getName());
    }

    @Test
    void getPriceExpresso() {
        Beverage expresso1 = new Expresso();
        Expresso expresso2 = new Expresso();
        float expected = 65_000F;
        assertEquals(expected, expresso1.getPrice());
        assertEquals(expected, expresso2.getPrice());
    }

    @Test
    void getCompatibleExpresso() {
        Beverage expresso1 = new Expresso();
        Expresso expresso2 = new Expresso();
        byte[] expected = {(byte)3, (byte)4};
        assertTrue(Arrays.equals(expresso1.getCompatible(), expected));
        assertTrue(Arrays.equals(expresso2.getCompatible(), expected));
    }




    //test CoconutWater class
    @Test
    void getNameCoconutWater() {
        Beverage coconutWater1 = new CoconutWater();
        CoconutWater coconutWater2 = new CoconutWater();
        String expected = "Coconut water";
        assertEquals(expected, coconutWater1.getName());
        assertEquals(expected, coconutWater2.getName());
    }

    @Test
    void getPriceCoconutWater() {
        Beverage coconutWater1 = new CoconutWater();
        CoconutWater coconutWater2 = new CoconutWater();
        float expected = 30_000F;
        assertEquals(expected, coconutWater1.getPrice());
        assertEquals(expected, coconutWater2.getPrice());
    }

    @Test
    void getCompatibleCoconutWater() {
        Beverage coconutWater1 = new CoconutWater();
        CoconutWater coconutWater2 = new CoconutWater();
        byte[] expected = {};
        assertTrue(Arrays.equals(coconutWater1.getCompatible(), expected));
        assertTrue(Arrays.equals(coconutWater2.getCompatible(), expected));
    }
}