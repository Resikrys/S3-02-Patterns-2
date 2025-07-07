package builder.builders;

import builder.pizzas.Pizza;
import builder.components.Size;
import builder.components.Dough;
import builder.components.Toppings;

public class CheesixPizzaBuilder implements PizzaBuilder {
    private Pizza.Builder pizzaBuilder; // Internal builder instance

    public CheesixPizzaBuilder() {
        this.pizzaBuilder = new Pizza.Builder();
        // Set default values for a Cheesix Pizza
        this.pizzaBuilder
                .withSize(Size.MEDIUM)
                .withDough(Dough.REGULAR)
                .withToppings(Toppings.CHEESE);
    }

    // These methods allow overriding defaults if needed, or you can just use the constructor's defaults
    @Override
    public PizzaBuilder setSize(Size size) {
        this.pizzaBuilder.withSize(size);
        return this;
    }

    @Override
    public PizzaBuilder setDough(Dough dough) {
        this.pizzaBuilder.withDough(dough);
        return this;
    }

    @Override
    public PizzaBuilder setToppings(Toppings toppings) {
        this.pizzaBuilder.withToppings(toppings);
        return this;
    }

    @Override
    public Pizza build() {
        return this.pizzaBuilder.build();
    }
}
