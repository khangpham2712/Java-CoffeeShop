package mycoffeeshop.controller.menu;

public enum AddOns {
    WHITE_BUBBLE((byte)1, "White bubble", 10_000F),
    BLACK_BUBBLE((byte)2, "Black bubble", 10_000F),
    CREAM((byte)3, "Cream", 10_000),
    WHIPPED_CREAM((byte)4, "Whipped cream", 10_000);

    private byte number;
    private String name;
    private float price;

    AddOns(byte number, String name, float price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }

    public byte getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}
