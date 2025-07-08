package builder.builders;

import builder.pizzas.Pizza;
import builder.components.Size;
import builder.components.Dough;
import builder.components.Toppings;
import java.util.Set;

public interface PizzaBuilder {
    // Methods to set the attributes, returning the builder for chaining
    PizzaBuilder setSize(Size size);
    PizzaBuilder setDough(Dough dough);
    PizzaBuilder addTopping(Toppings topping); //To add one topping at a time
    PizzaBuilder withToppings(Set<Toppings> toppings); // To set a whole collection of toppings

    // To reset the builder's internal state
    void reset();

    // To get the constructed Pizza product
    Pizza build();
}
