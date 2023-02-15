package mycoffeeshop.observer.socialnetworks;

import mycoffeeshop.observer.Observer;
import mycoffeeshop.observer.status.OrderStatus;

public class TelegramNotification implements Observer {
    OrderStatus orderStatus;

    public TelegramNotification(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public void sendNotifications() {
        System.out.println("(Telegram) Your order is " + orderStatus.getStatus() + " at " + new java.util.Date());
    }
}
