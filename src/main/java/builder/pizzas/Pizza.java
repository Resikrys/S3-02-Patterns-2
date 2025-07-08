package builder.pizzas;

import builder.components.Size;
import builder.components.Dough;
import builder.components.Toppings;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Pizza {
    private Size size;
    private Dough dough;
    private Set<Toppings> toppings;

    // Private constructor to be used only by the Builder
    private Pizza(Builder builder) {
        this.size = builder.size;
        this.dough = builder.dough;
        this.toppings = new HashSet<>(builder.toppings); //Create a defensive copy to ensure immutability (identical copy but disconnected from the original)
    }

    public Size getSize() {
        return size;
    }

    public Dough getDough() {
        return dough;
    }

    public Set<Toppings> getToppings() {
        return new HashSet<>(toppings);
    }

    @Override
    public String toString() {
        String toppingsString = toppings.isEmpty() ? "None" :
                toppings.stream()
                        .map(Toppings::getDescription)
                        .collect(Collectors.joining(", "));

        return "Pizza [Size=" + size.getDescription() +
                ", Dough=" + dough.getDescription() +
                ", Toppings=" + toppingsString + "]";
    }

    // --- Inner Builder Class --- Return "this" for method chaining
    public static class Builder {
        private Size size;
        private Dough dough;
        private Set<Toppings> toppings;

        public Builder withSize(Size size) {
            this.size = size;
            return this;
        }

        public Builder withDough(Dough dough) {
            this.dough = dough;
            return this;
        }

        // NEW METHOD: Add a single topping
        public Builder addTopping(Toppings topping) {
            if (topping != null) {
                this.toppings.add(topping);
            }
            return this;
        }

        // Method to set multiple toppings at once (overwriting existing ones)
        public Builder withToppings(Set<Toppings> toppings) {
            this.toppings.clear(); // Clear existing
            if (toppings != null) {
                this.toppings.addAll(toppings);
            }
            return this;
        }

        // The build method creates the Pizza instance
        public Pizza build() {
            if (size == null || dough == null) {
                throw new IllegalStateException("Pizza must have a size and dough.");
            }
            return new Pizza(this);
        }
    }
}
