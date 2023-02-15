package mycoffeeshop.observer.socialnetworks;

import mycoffeeshop.observer.Observer;
import mycoffeeshop.observer.status.OrderStatus;

public class ZaloNotification implements Observer {
    OrderStatus orderStatus;

    public ZaloNotification(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public void sendNotifications() {
        System.out.println("(Zalo) Your order is " + orderStatus.getStatus() + " at " + new java.util.Date());
    }
}
