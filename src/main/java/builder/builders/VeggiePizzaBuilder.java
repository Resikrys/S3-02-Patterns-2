package builder.builders;

import builder.pizzas.Pizza;
import builder.components.Size;
import builder.components.Dough;
import builder.components.Toppings;
import java.util.Set;
import java.util.HashSet;

public class VeggiePizzaBuilder implements PizzaBuilder {
    private Pizza.Builder pizzaBuilder;

//    public VeggiePizzaBuilder() {
//        this.pizzaBuilder = new Pizza.Builder();
//        this.pizzaBuilder
//                .withSize(Size.MEDIUM)
//                .withDough(Dough.THIN_CRUST);
//        this.pizzaBuilder.addTopping(Toppings.MUSHROOMS);
//        this.pizzaBuilder.addTopping(Toppings.ONIONS);
//        this.pizzaBuilder.addTopping(Toppings.PEPPERS);
//        this.pizzaBuilder.addTopping(Toppings.OLIVES);
//    }

    public VeggiePizzaBuilder() {
        reset();
    }

    @Override
    public void reset() {
        this.pizzaBuilder = new Pizza.Builder();
        this.pizzaBuilder
                .withSize(Size.MEDIUM)
                .withDough(Dough.THIN_CRUST);
        this.pizzaBuilder.addTopping(Toppings.MUSHROOMS);
        this.pizzaBuilder.addTopping(Toppings.ONIONS);
        this.pizzaBuilder.addTopping(Toppings.PEPPERS);
        this.pizzaBuilder.addTopping(Toppings.OLIVES);
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
