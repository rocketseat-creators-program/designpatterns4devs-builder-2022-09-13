package pizzaria.functional;

import pizzaria.fluent.model.builder.PizzaFluentBuilder;
import pizzaria.functional.model.Pizza;
import pizzaria.functional.model.Size;

public class Client {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza.Builder(Size.EIGHT_PIECES).now();
        System.out.println(pizza1);

        Pizza pizza2 = new Pizza.Builder(Size.FOUR_PIECES)
                .withToppings("Mushroom", "Tomatoes")
                .withSauces("Spice")
                .withCheese()
                .now();
        System.out.println(pizza2);

        Pizza pizza3 = new Pizza.Builder(Size.SIXTEEN_PIECES)
                .withToppings("Garlic")
                .withSauces("Spice", "Brazilian")
                .withCheese()
                .withPepper()
                .now();
        System.out.println(pizza3);
    }
}
