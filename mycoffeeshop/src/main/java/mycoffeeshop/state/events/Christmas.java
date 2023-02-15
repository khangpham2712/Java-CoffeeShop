package mycoffeeshop.state.events;

import mycoffeeshop.state.Events;

public class Christmas implements Events {
    private float percentage;
    private String name;

    public Christmas(float percentage) {
        name = "Christmas";
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
