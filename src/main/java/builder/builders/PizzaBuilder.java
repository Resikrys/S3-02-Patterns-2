package builder.builders;

import builder.pizzas.Pizza;
import builder.components.Size;
import builder.components.Dough;
import builder.components.Toppings;

public interface PizzaBuilder {
    // Methods to set the attributes, returning the builder for chaining
    PizzaBuilder setSize(Size size);
    PizzaBuilder setDough(Dough dough);
    PizzaBuilder setToppings(Toppings toppings);

    // Method to get the constructed Pizza product
    Pizza build();
}
