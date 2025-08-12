package builder.builders;

import builder.pizzas.Pizza;
import builder.components.Size;
import builder.components.Dough;
import builder.components.Toppings;
import java.util.Set;

public interface PizzaBuilder {
    PizzaBuilder setSize(Size size);
    PizzaBuilder setDough(Dough dough);
    PizzaBuilder addTopping(Toppings topping);
    PizzaBuilder withToppings(Set<Toppings> toppings);

    void reset();

    Pizza build();
}
