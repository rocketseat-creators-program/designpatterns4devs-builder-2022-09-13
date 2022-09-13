package pizzaria.after;

import pizzaria.after.model.ClassicPizza;
import pizzaria.after.model.MiniPizza;
import pizzaria.after.model.Size;
import pizzaria.after.model.builder.ClassicPizzaBuilder;
import pizzaria.after.model.builder.MiniPizzaBuilder;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        ClassicPizzaBuilder classicPizzaBuilder = new ClassicPizzaBuilder();
        classicPizzaBuilder.setSize(Size.EIGHT_PIECES);
        ClassicPizza p1 = classicPizzaBuilder.getResult();
        System.out.println(p1);

        MiniPizzaBuilder miniPizzaBuilder = new MiniPizzaBuilder();
        miniPizzaBuilder.setSize(Size.FOUR_PIECES);
        miniPizzaBuilder.setToppings(Arrays.asList("Tomato", "Oregano"));
        miniPizzaBuilder.setSauce(Arrays.asList("Spice"));
        miniPizzaBuilder.setCheese(true);

        MiniPizza miniPizza = miniPizzaBuilder.getResult();
        System.out.println(miniPizza);

        classicPizzaBuilder = new ClassicPizzaBuilder();
        classicPizzaBuilder.setToppings(Arrays.asList("Mushrooms"));
        classicPizzaBuilder.setSauce(Arrays.asList("Spice", "Brazilian"));
        classicPizzaBuilder.setSize(Size.SIXTEEN_PIECES);
        classicPizzaBuilder.setCheese(true);
        classicPizzaBuilder.setPepper(true);
        ClassicPizza p3 = classicPizzaBuilder.getResult();
        System.out.println(p3);
    }


}
