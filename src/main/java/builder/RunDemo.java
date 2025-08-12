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

        makeAndShowPizza("Cheesix Pizza", new CheesixPizzaBuilder());
        makeAndShowPizza("Veggie Pizza", new VeggiePizzaBuilder());
        makeAndShowPizza("BBQ Pizza", new BbqPizzaBuilder());

        makeAndShowCustomPizza("My Custom Pizza");
        makeAndShowHawaiianPizza();
    }

    private void makeAndShowPizza(String pizzaName, PizzaBuilder builder) {
        System.out.println("\n--- Building " + pizzaName + " ---");
        pizzaMaker.setPizzaBuilder(builder);
        Pizza pizza = builder.build();
        System.out.println(pizzaName + ": " + pizza);
    }

    private void makeAndShowCustomPizza(String pizzaName) {
        System.out.println("\n--- Building " + pizzaName + " ---");
        CustomPizzaBuilder customBuilder = new CustomPizzaBuilder();
        pizzaMaker.setPizzaBuilder(customBuilder);

        Set<Toppings> customToppings = new HashSet<>();
        customToppings.add(Toppings.CHICKEN);
        customToppings.add(Toppings.MUSHROOMS);
        customToppings.add(Toppings.OLIVES);

        Pizza customPizza = pizzaMaker.makeCustomPizza(Size.FAMILIAR, Dough.THICK, customToppings);
        System.out.println(pizzaName + ": " + customPizza);
    }

    private void makeAndShowHawaiianPizza() {
        System.out.println("\n--- Building Hawaian Pizza ---");
        CustomPizzaBuilder hawaiianBuilder = new CustomPizzaBuilder();
        pizzaMaker.setPizzaBuilder(hawaiianBuilder);

        Set<Toppings> hawaiianToppings = new HashSet<>();
        hawaiianToppings.add(Toppings.HAM);
        hawaiianToppings.add(Toppings.PINEAPPLE);

        Pizza hawaiianPizza = pizzaMaker.makeCustomPizza(Size.SMALL, Dough.THIN_CRUST, hawaiianToppings);
        System.out.println("Hawaian Pizza: " + hawaiianPizza);
    }
}
