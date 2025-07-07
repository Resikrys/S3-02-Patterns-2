package builder.pizzas;

import builder.components.Size;
import builder.components.Dough;
import builder.components.Toppings;

public class Pizza {
    private Size size;
    private Dough dough;
    private Toppings toppings;

    // Private constructor to be used only by the Builder
    private Pizza(Builder builder) {
        this.size = builder.size;
        this.dough = builder.dough;
        this.toppings = builder.toppings;
    }

    public Size getSize() {
        return size;
    }

    public Dough getDough() {
        return dough;
    }

    public Toppings getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Pizza [Size: " + size.getDescription() + ", Dough: " + dough.getDescription() +
                ", Toppings: " + (toppings != null ? toppings.getDescription() : "None") + "]";
    }

    // --- Inner Builder Class --- Return "this" for method chaining
    public static class Builder {
        private Size size;
        private Dough dough;
        private Toppings toppings;

        public Builder withSize(Size size) {
            this.size = size;
            return this;
        }

        public Builder withDough(Dough dough) {
            this.dough = dough;
            return this;
        }

        public Builder withToppings(Toppings toppings) {
            this.toppings = toppings;
            return this;
        }

        // The build method creates the Pizza instance
        public Pizza build() {
            if (size == null || dough == null) {
                throw new IllegalStateException("Pizza must have a size and dough."); //Basic validation
            }
            return new Pizza(this);
        }
    }
}
