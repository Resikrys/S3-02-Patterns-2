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
    PizzaBuilder addTopping(Toppings topping); //Add a method to add one topping at a time
    //PizzaBuilder withToppings(Set<Toppings> toppings); // Method to set a whole collection of toppings

    // Method to get the constructed Pizza product
    Pizza build();
}
