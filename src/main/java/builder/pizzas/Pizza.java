package builder.pizzas;

public class Pizza {
    private String size;
    private String dough;
    private String toppings;

    // Private constructor to be used only by the Builder
    private Pizza(Builder builder) {
        this.size = builder.size;
        this.dough = builder.dough;
        this.toppings = builder.toppings;
    }

    public String getSize() {
        return size;
    }

    public String getDough() {
        return dough;
    }

    public String getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Pizza [Size: " + size + ", Dough: " + dough + ", Toppings: " + toppings + "]";
    }

    // --- Inner Builder Class --- Return "this" for method chaining
    public static class Builder {
        private String size;
        private String dough;
        private String toppings;

        public Builder withSize(String size) {
            this.size = size;
            return this;
        }

        public Builder withDough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder withToppings(String toppings) {
            this.toppings = toppings;
            return this;
        }

        // The build method creates the Pizza instance
        public Pizza build() {
            return new Pizza(this);
        }
    }
}
