package builder.builders;

import builder.pizzas.Pizza;
import builder.components.Size;
import builder.components.Dough;
import builder.components.Toppings;

public class BbqPizzaBuilder implements PizzaBuilder {
    private Pizza.Builder pizzaBuilder;

    public BbqPizzaBuilder() {
        this.pizzaBuilder = new Pizza.Builder();
        this.pizzaBuilder
                .withSize(Size.FAMILIAR)
                .withDough(Dough.REGULAR)
                .withToppings(Toppings.CHICKEN);
    }

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
