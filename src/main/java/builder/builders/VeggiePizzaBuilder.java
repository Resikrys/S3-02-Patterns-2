package builder.builders;

import builder.pizzas.Pizza;
import builder.components.Size;
import builder.components.Dough;
import builder.components.Toppings;

public class VeggiePizzaBuilder implements PizzaBuilder {
    private Pizza.Builder pizzaBuilder;

    public VeggiePizzaBuilder() {
        this.pizzaBuilder = new Pizza.Builder();
        this.pizzaBuilder
                .withSize(Size.MEDIUM)
                .withDough(Dough.THIN_CRUST)
                .withToppings(Toppings.MUSHROOMS);
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
