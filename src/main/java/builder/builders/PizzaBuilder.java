package builder.builders;

import builder.pizzas.Pizza;

public interface PizzaBuilder {
    // Methods to set the attributes, returning the builder for chaining
    PizzaBuilder setSize(String size);
    PizzaBuilder setDough(String dough);
    PizzaBuilder setToppings(String toppings);

    // Method to get the constructed Pizza product
    Pizza build();
}
