package mycoffeeshop.observer.status;

import mycoffeeshop.observer.Subject;

public class OrderStatus extends Subject {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }
}
