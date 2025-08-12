package builder.builders;

import builder.components.Dough;
import builder.components.Size;
import builder.components.Toppings;
import builder.pizzas.Pizza;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class PizzaBuilderTest {

    @Test
    void testCheesixPizzaBuilder() {
        CheesixPizzaBuilder cheesixBuilder = new CheesixPizzaBuilder();
        Pizza cheesixPizza = cheesixBuilder.build();

        assertEquals(Size.MEDIUM, cheesixPizza.getSize(), "The size of a Cheesix pizza should be MEDIUM");
        assertEquals(Dough.REGULAR, cheesixPizza.getDough(), "The dough of a Cheesix pizza should be REGULAR");
        assertTrue(cheesixPizza.getToppings().contains(Toppings.CHEESE), "The Cheesix pizza should contain CHEESE topping");
        assertEquals(1, cheesixPizza.getToppings().size(), "The Cheesix pizza should only have 1 topping by default");
    }

    @Test
    void testVeggiePizzaBuilder() {
        VeggiePizzaBuilder veggieBuilder = new VeggiePizzaBuilder();
        Pizza veggiePizza = veggieBuilder.build();

        assertEquals(Size.MEDIUM, veggiePizza.getSize(), "The size of a Veggie pizza should be MEDIUM");
        assertEquals(Dough.THIN_CRUST, veggiePizza.getDough(), "The dough of a Veggie pizza should be THIN_CRUST");

        Set<Toppings> expectedToppings = new HashSet<>();
        expectedToppings.add(Toppings.MUSHROOMS);
        expectedToppings.add(Toppings.ONIONS);
        expectedToppings.add(Toppings.PEPPERS);
        expectedToppings.add(Toppings.OLIVES);

        assertEquals(expectedToppings.size(), veggiePizza.getToppings().size(), "The number of toppings should match");
        assertTrue(veggiePizza.getToppings().containsAll(expectedToppings), "The Veggie pizza should contain all expected veggie toppings");
    }

    @Test
    void testCustomPizzaBuilder() {
        CustomPizzaBuilder customBuilder = new CustomPizzaBuilder();
        Set<Toppings> customToppings = new HashSet<>();
        customToppings.add(Toppings.PEPPERONI);
        customToppings.add(Toppings.MUSHROOMS);

        customBuilder.setSize(Size.FAMILIAR);
        customBuilder.setDough(Dough.THICK);
        customBuilder.withToppings(customToppings);
        Pizza customPizza = customBuilder.build();

        assertEquals(Size.FAMILIAR, customPizza.getSize(), "Custom pizza size should be LARGE");
        assertEquals(Dough.THICK, customPizza.getDough(), "Custom pizza dough should be THICK");
        assertEquals(customToppings.size(), customPizza.getToppings().size(), "The number of custom toppings should match");
        assertTrue(customPizza.getToppings().containsAll(customToppings), "Custom pizza should contain all specified toppings");
    }

}