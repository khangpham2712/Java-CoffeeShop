package mycoffeeshop.controller.menu;

public enum Drinks {
    MILK_TEA((byte)1, "Milk tea", 45_000F, (byte)1, (byte)2),
    MATCHA_TEA((byte)2, "Matcha tea", 55_000F, (byte)1, (byte)2),
    CAPPUCCINO((byte)3, "Cappuccino", 65_000F, (byte)3, (byte)4),
    EXPRESSO((byte)4, "Expresso", 65_000F, (byte)3, (byte)4),
    COCONUT_WATER((byte)5, "Coconut water", 30_000);

    private byte number;
    private String name;
    private float price;
    private byte[] compatible;

    Drinks(byte number, String name, float price, byte... compatible) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.compatible = compatible;
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

    public byte[] getCompatible() {
        return compatible;
    }
}
