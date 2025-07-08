package builder.components;

public enum Toppings {
    CHEESE("Cheese"),
    MOZZARELLA("Mozzarella"),
    PARMESAN("Parmesan"),
    PEPPERONI("Pepperoni"),
    MUSHROOMS("Mushrooms"),
    ONIONS("Onions"),
    HAM("Ham"),
    PINEAPPLE("Pineapple"),
    PEPPERS("Peppers"),
    OLIVES("Olives"),
    CHICKEN("Chicken"),
    BBQ_SAUCE("BBQ Sauce");

    private final String description;

    Toppings(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
