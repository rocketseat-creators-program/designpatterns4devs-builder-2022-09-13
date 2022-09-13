package pizzaria.fluent;

import pizzaria.fluent.model.Pizza;
import pizzaria.fluent.model.Size;
import pizzaria.fluent.model.builder.PizzaFluentBuilder;

public class Client {

    public static void main(String[] args) {
        Pizza pizza1 = new PizzaFluentBuilder(Size.EIGHT_PIECES).now();
        System.out.println(pizza1);

        Pizza pizza2 = new PizzaFluentBuilder(Size.FOUR_PIECES)
                .withToppings("Mushroom", "Tomatoes")
                .withSauces("Spice")
                .withCheese()
                .now();
        System.out.println(pizza2);

        Pizza pizza3 = new PizzaFluentBuilder(Size.SIXTEEN_PIECES)
                .withToppings("Garlic")
                .withSauces("Spice", "Brazilian")
                .withCheese()
                .withPepper()
                .now();
        System.out.println(pizza3);
    }
}
