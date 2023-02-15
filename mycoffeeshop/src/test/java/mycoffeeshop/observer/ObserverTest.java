package mycoffeeshop.observer;

import mycoffeeshop.decorator.Beverage;
import mycoffeeshop.observer.socialnetworks.GmailNotification;
import mycoffeeshop.observer.socialnetworks.TelegramNotification;
import mycoffeeshop.observer.socialnetworks.ZaloNotification;
import mycoffeeshop.observer.status.OrderStatus;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObserverTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }




    //test zalo notifications
    @Test
    void sendNotificationsOnZalo() {
        Beverage beverage;
        OrderStatus orderStatus = new OrderStatus();
        orderStatus.addObserver(new ZaloNotification(orderStatus));
        orderStatus.setStatus("received");
        orderStatus.setStatus("done");
    }




    //test telegram notifications
    @Test
    void sendNotificationsOnTelegram() {
        OrderStatus orderStatus = new OrderStatus();
        orderStatus.addObserver(new TelegramNotification(orderStatus));
        orderStatus.setStatus("received");
        orderStatus.setStatus("done");
    }




    //test gmail notifications
    @Test
    void sendNotificationsOnGmail() {
        Beverage beverage;
        OrderStatus orderStatus = new OrderStatus();
        orderStatus.addObserver(new GmailNotification(orderStatus));
        orderStatus.setStatus("received");
        orderStatus.setStatus("done");
    }
}