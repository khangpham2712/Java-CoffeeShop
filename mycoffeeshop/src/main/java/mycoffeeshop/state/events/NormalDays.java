package mycoffeeshop.state.events;

import mycoffeeshop.state.Events;

public class NormalDays implements Events {
    private float percentage;
    private String name;

    public NormalDays(float percentage) {
        name = "a normal day";
        this.percentage = percentage;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float discount(float total) {
        return total - total * percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public float getPercentage() {
        return percentage;
    }
}
