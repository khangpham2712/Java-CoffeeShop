package mycoffeeshop.observer.socialnetworks;

import mycoffeeshop.observer.Observer;
import mycoffeeshop.observer.status.OrderStatus;

public class GmailNotification implements Observer {
    OrderStatus orderStatus;

    public GmailNotification(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public void sendNotifications() {
        System.out.println("(Gmail) Your order is " + orderStatus.getStatus() + " at " + new java.util.Date());
    }
}
