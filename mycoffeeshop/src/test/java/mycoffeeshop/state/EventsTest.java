package mycoffeeshop.state;

import mycoffeeshop.state.events.BlackFriday;
import mycoffeeshop.state.events.Christmas;
import mycoffeeshop.state.events.NormalDays;
import mycoffeeshop.state.events.TetHoliday;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class EventsTest {
    private Events event;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        event = null;
    }




    //test NormalDays class
    @ParameterizedTest
    @ValueSource(floats = {95_000F, 45_000F, 15_000F, 30_000F, 50_000F})
    void discountNormalDays0(float total) {
        float input = 0F;
        event = new NormalDays(input);
        float expected = total - total * input;
        assertEquals(expected, event.discount(total));
    }




    //test TetHoliday class
    @ParameterizedTest
    @ValueSource(floats = {70_000F, 19_000F, 5_000F, 300_000F, 150_000F})
    void discountTetHoliday20(float total) {
        float input = 0.2F;
        event = new TetHoliday(input);
        float expected = total - total * input;
        assertEquals(expected, event.discount(total));
    }

    @ParameterizedTest
    @ValueSource(floats = {1_000F, 100_000F, 17_000F, 35_000F, 55_000F})
    void discountTetHoliday15(float total) {
        float input = 0.15F;
        event = new TetHoliday(input);
        float expected = total - total * input;
        assertEquals(expected, event.discount(total));
    }




    //test Christmas class
    @ParameterizedTest
    @ValueSource(floats = {115_000F, 450_000F, 45_000F, 27_000F, 40_000F})
    void discountChristmas25(float total) {
        float input = 0.25F;
        event = new Christmas(input);
        float expected = total - total * input;
        assertEquals(expected, event.discount(total));
    }

    @ParameterizedTest
    @ValueSource(floats = {1_000F, 2_000F, 3_000F, 4_000F, 5_000F})
    void discountChristmas35(float total) {
        float input = 0.35F;
        event = new Christmas(input);
        float expected = total - total * input;
        assertEquals(expected, event.discount(total));
    }




    //test BlackFriday class
    @ParameterizedTest
    @ValueSource(floats = {10_000F, 20_000F, 30_000F, 40_000F, 50_000F})
    void discountBlackFriday5(float total) {
        float input = 0.05F;
        event = new BlackFriday(input);
        float expected = total - total * input;
        assertEquals(expected, event.discount(total));
    }

    @ParameterizedTest
    @ValueSource(floats = {100_000F, 200_000F, 300_000F, 400_000F, 500_000F})
    void discountBlackFriday10(float total) {
        float input = 0.1F;
        event = new BlackFriday(input);
        float expected = total - total * input;
        assertEquals(expected, event.discount(total));
    }




    //test NormalDays other methods
    @Test
    void testNormalDaysOtherMethods() {
        NormalDays event = new NormalDays(0F);
        assertEquals(0F, event.getPercentage());
        event.setPercentage(0.1F);
        assertEquals(0.1F, event.getPercentage());
    }


    //test TetHoliday other methods
    @Test
    void testTetHolidayOtherMethods() {
        TetHoliday event = new TetHoliday(0.2F);
        assertEquals(0.2F, event.getPercentage());
        event.setPercentage(0.5F);
        assertEquals(0.5F, event.getPercentage());
    }


    //test Christmas other methods
    @Test
    void testChristmasOtherMethods() {
        Christmas event = new Christmas(0.15F);
        assertEquals(0.15F, event.getPercentage());
        event.setPercentage(0.05F);
        assertEquals(0.05F, event.getPercentage());
    }


    //test BlackFriday other methods
    @Test
    void testBlackFridayOtherMethods() {
        BlackFriday event = new BlackFriday(0.75F);
        assertEquals(0.75F, event.getPercentage());
        event.setPercentage(0.015F);
        assertEquals(0.015F, event.getPercentage());
    }
}