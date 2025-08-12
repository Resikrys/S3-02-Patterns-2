package builder.director;

import builder.builders.PizzaBuilder;
import builder.components.Size;
import builder.components.Dough;
import builder.components.Toppings;
import builder.pizzas.Pizza;

import java.util.HashSet;
import java.util.Set;

public class PizzaMaker {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza makeCheesixPizza() {
        pizzaBuilder.reset();

        pizzaBuilder.setSize(Size.MEDIUM);
        pizzaBuilder.setDough(Dough.REGULAR);

        Set<Toppings> cheesixToppings = new HashSet<>();
        cheesixToppings.add(Toppings.CHEESE);
        // Add more cheese variations
         cheesixToppings.add(Toppings.MOZZARELLA);
         cheesixToppings.add(Toppings.PARMESAN);
        pizzaBuilder.withToppings(cheesixToppings);

        return pizzaBuilder.build();
    }

    public Pizza makeVeggiePizza() {
        pizzaBuilder.reset();
        pizzaBuilder.setSize(Size.MEDIUM);
        pizzaBuilder.setDough(Dough.THIN_CRUST);

        Set<Toppings> veggieToppings = new HashSet<>();
        veggieToppings.add(Toppings.MUSHROOMS);
        veggieToppings.add(Toppings.ONIONS);
        veggieToppings.add(Toppings.PEPPERS);
        veggieToppings.add(Toppings.OLIVES);
        pizzaBuilder.withToppings(veggieToppings);

        return pizzaBuilder.build();
    }

    public Pizza makeBbqPizza() {
        pizzaBuilder.reset();
        pizzaBuilder.setSize(Size.FAMILIAR);
        pizzaBuilder.setDough(Dough.REGULAR);

        Set<Toppings> bbqToppings = new HashSet<>();
        bbqToppings.add(Toppings.CHICKEN);
        bbqToppings.add(Toppings.BBQ_SAUCE);
        bbqToppings.add(Toppings.ONIONS);
        pizzaBuilder.withToppings(bbqToppings);

        return pizzaBuilder.build();
    }

    public Pizza makeCustomPizza(Size size, Dough dough, Set<Toppings> toppings) {
        pizzaBuilder.reset();
        pizzaBuilder.setSize(size);
        pizzaBuilder.setDough(dough);
        pizzaBuilder.withToppings(toppings);

        return pizzaBuilder.build();
    }
}
