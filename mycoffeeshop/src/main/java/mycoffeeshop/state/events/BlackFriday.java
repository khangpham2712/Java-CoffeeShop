package mycoffeeshop.state.events;

import mycoffeeshop.state.Events;

public class BlackFriday implements Events {
    private float percentage;
    private String name;

    public BlackFriday(float percentage) {
        name = "Black Friday";
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
