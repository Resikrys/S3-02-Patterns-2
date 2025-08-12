package builder;

import builder.builders.*;
import builder.director.PizzaMaker;
import builder.pizzas.Pizza;

import builder.components.Dough;
import builder.components.Size;
import builder.components.Toppings;

import java.util.HashSet;
import java.util.Set;

public class RunDemo {
    private final PizzaMaker pizzaMaker = new PizzaMaker();

    public void runExamples() {
        System.out.println("--- Pizza Order System ---");

        System.out.println("\n--- Building Cheesix Pizza ---");
        pizzaMaker.setPizzaBuilder(new CheesixPizzaBuilder());
        Pizza cheesixPizza = pizzaMaker.makeCheesixPizza();
        System.out.println("Cheesix Pizza: " + cheesixPizza);

        System.out.println("\n--- Building Veggie Pizza ---");
        pizzaMaker.setPizzaBuilder(new VeggiePizzaBuilder());
        Pizza veggiePizza = pizzaMaker.makeVeggiePizza();
        System.out.println("Veggie Pizza: " + veggiePizza);

        System.out.println("\n--- Building BBQ Pizza ---");
        pizzaMaker.setPizzaBuilder(new BbqPizzaBuilder());
        Pizza bbqPizza = pizzaMaker.makeBbqPizza();
        System.out.println("BBQ Pizza: " + bbqPizza);

        System.out.println("\n--- Building My Custom Pizza ---");
        pizzaMaker.setPizzaBuilder(new CustomPizzaBuilder());
        Set<Toppings> customToppings = new HashSet<>();
        customToppings.add(Toppings.CHICKEN);
        customToppings.add(Toppings.MUSHROOMS);
        customToppings.add(Toppings.OLIVES);
        Pizza myCustomPizza = pizzaMaker.makeCustomPizza(Size.FAMILIAR, Dough.THICK, customToppings);
        System.out.println("My Custom Pizza: " + myCustomPizza);

        System.out.println("\n--- Building Hawaian Pizza ---");
        pizzaMaker.setPizzaBuilder(new CustomPizzaBuilder());
        Set<Toppings> hawaiianToppings = new HashSet<>();
        hawaiianToppings.add(Toppings.HAM);
        hawaiianToppings.add(Toppings.PINEAPPLE);
        Pizza hawaiianPizza = pizzaMaker.makeCustomPizza(Size.SMALL, Dough.THIN_CRUST, hawaiianToppings);
        System.out.println("Hawaian Pizza: " + hawaiianPizza);

    }

}
