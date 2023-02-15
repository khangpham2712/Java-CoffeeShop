package mycoffeeshop.controller;

import mycoffeeshop.controller.console.Console;
import mycoffeeshop.controller.search.MySearch;
import mycoffeeshop.singleton.Cart;
import mycoffeeshop.state.Events;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class ControllerTest {
    private Controller controller;
    private Cart cart = Cart.getInstance();

    @Mock
    private Events mockedEvent;

    @BeforeEach
    void setUp() {
        mockedEvent = mock(Events.class);
        controller = new Controller(mockedEvent);
    }

    @AfterEach
    void tearDown() {
        controller = null;
        cart.clearCart();
    }




    @Test
    void setEventShouldSetEvent() {
        controller.setEvent(mockedEvent);
        assertEquals(mockedEvent, controller.getEvent());
    }

    @Test
    void getEventShouldReturnMockedEvent() {
        assertEquals(mockedEvent, controller.getEvent());
    }




    //test Console class
    @Test
    void createAScannerShouldReturnAnInstanceOfScanner() {
        Scanner scanner = Console.getScanner();
        assertTrue(scanner instanceof Scanner);
    }




    //test search method
    @Test
    void searchForFiveShouldReturnTrue() {
        byte[] arr = {(byte)1, (byte)3, (byte)5, (byte)6, (byte)10, (byte)12, (byte)99};
        byte value = (byte)5;
        assertTrue(MySearch.search(arr, 0, arr.length - 1, value));
    }

    @Test
    void searchForOneShouldReturnTrue() {
        byte[] arr = {(byte)1, (byte)3, (byte)5, (byte)6, (byte)10, (byte)12, (byte)99};
        byte value = (byte)1;
        assertTrue(MySearch.search(arr, 0, arr.length - 1, value));
    }

    @Test
    void searchForNinetyNineShouldReturnTrue() {
        byte[] arr = {(byte)1, (byte)3, (byte)5, (byte)6, (byte)10, (byte)12, (byte)99};
        byte value = (byte)99;
        assertTrue(MySearch.search(arr, 0, arr.length - 1, value));
    }

    @Test
    void searchForSevenShouldReturnFalse() {
        byte[] arr = {(byte)1, (byte)3, (byte)5, (byte)6, (byte)10, (byte)12, (byte)99};
        byte value = (byte)7;
        assertFalse(MySearch.search(arr, 0, arr.length - 1, value));
    }

    @Test
    void searchForFiftyShouldReturnFalse() {
        byte[] arr = {(byte)1, (byte)3, (byte)5, (byte)6, (byte)10, (byte)12, (byte)99};
        byte value = (byte)50;
        assertFalse(MySearch.search(arr, 0, arr.length - 1, value));
    }
}