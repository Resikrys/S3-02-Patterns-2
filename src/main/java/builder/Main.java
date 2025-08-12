package builder;

import builder.builders.CheesixPizzaBuilder;
import builder.builders.VeggiePizzaBuilder;
import builder.builders.BbqPizzaBuilder;
import builder.builders.CustomPizzaBuilder;
import builder.director.PizzaMaker;
import builder.pizzas.Pizza;
import builder.components.Size;
import builder.components.Dough;
import builder.components.Toppings;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        new RunDemo().runExamples();
//        System.out.println("--- Pizza Order System ---");
//
//        PizzaMaker pizzaMaker = new PizzaMaker();
//
//        // Cheesix Pizza
//        System.out.println("\n--- Building a Cheesix Pizza ---");
//        CheesixPizzaBuilder cheesixBuilder = new CheesixPizzaBuilder();
//        pizzaMaker.setPizzaBuilder(cheesixBuilder);
//        Pizza cheesixPizza = pizzaMaker.makeCheesixPizza();
//        System.out.println("Cheesix Pizza: " + cheesixPizza);
//
//        // Veggie Pizza
//        System.out.println("\n--- Building a Veggie Pizza ---");
//        VeggiePizzaBuilder veggieBuilder = new VeggiePizzaBuilder();
//        pizzaMaker.setPizzaBuilder(veggieBuilder);
//        Pizza veggiePizza = pizzaMaker.makeVeggiePizza();
//        System.out.println("Veggie Pizza: " + veggiePizza);
//
//        // 3. BBQ Pizza
//        System.out.println("\n--- Building a BBQ Pizza ---");
//        BbqPizzaBuilder bbqBuilder = new BbqPizzaBuilder();
//        pizzaMaker.setPizzaBuilder(bbqBuilder);
//        Pizza bbqPizza = pizzaMaker.makeBbqPizza();
//        System.out.println("BBQ Pizza: " + bbqPizza);
//
//        // Custom Pizza
//        System.out.println("\n--- Building a Custom Pizza ---");
//        CustomPizzaBuilder customPizzaBuilder = new CustomPizzaBuilder();
//        pizzaMaker.setPizzaBuilder(customPizzaBuilder);
//        Set<Toppings> customToppings = new HashSet<>();
//        customToppings.add(Toppings.CHICKEN);
//        customToppings.add(Toppings.MUSHROOMS);
//        customToppings.add(Toppings.OLIVES);
//        customToppings.add(Toppings.MOZZARELLA);
//        customToppings.add(Toppings.PARMESAN);
//        Pizza myCustomPizza = pizzaMaker.makeCustomPizza(Size.FAMILIAR, Dough.THICK, customToppings);
//        System.out.println("My Custom Pizza: " + myCustomPizza);
//
//        //Another Custom pizza
//        Set<Toppings> anotherCustomToppings = new HashSet<>();
//        anotherCustomToppings.add(Toppings.HAM);
//        anotherCustomToppings.add(Toppings.PINEAPPLE);
//
//        Pizza evilHawaiianCustomPizza = pizzaMaker.makeCustomPizza(Size.SMALL, Dough.THIN_CRUST, anotherCustomToppings);
//        System.out.println("Another Custom Pizza (Hawaiian-like): " + evilHawaiianCustomPizza);

    }
}
