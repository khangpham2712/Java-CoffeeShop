package mycoffeeshop.decorator;

public interface Beverage {
    String getName();
    float getPrice();
    default byte[] getCompatible() {
        return null;
    }
}
