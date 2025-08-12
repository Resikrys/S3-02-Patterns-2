package builder.builders;

import builder.pizzas.Pizza;
import builder.components.Size;
import builder.components.Dough;
import builder.components.Toppings;
import java.util.Set;

public class CustomPizzaBuilder implements PizzaBuilder {
    private Pizza.Builder pizzaBuilder;

    public CustomPizzaBuilder() {
        reset();
    }

    @Override
    public void reset() {
        this.pizzaBuilder = new Pizza.Builder();
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
    public PizzaBuilder addTopping(Toppings topping) {
        this.pizzaBuilder.addTopping(topping);
        return this;
    }

    @Override
    public PizzaBuilder withToppings(Set<Toppings> toppings) {
        this.pizzaBuilder.withToppings(toppings);
        return this;
    }

    @Override
    public Pizza build() {
        return this.pizzaBuilder.build();
    }
}
