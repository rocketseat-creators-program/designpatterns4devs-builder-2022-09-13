package pizzaria.before;

import pizzaria.before.model.Pizza;
import pizzaria.before.model.Size;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        Pizza p1 = new Pizza(Size.FOUR_PIECES);
        System.out.println(p1);

        Pizza p2 = new Pizza(Arrays.asList("Chicken", "Tomatoes"), Arrays.asList("Tomato"), Size.SIXTEEN_PIECES, true);
        System.out.println(p2);

        Pizza p3 = new Pizza(Arrays.asList("Mushrooms"), Arrays.asList("Beef", "Doritos"), Size.EIGHT_PIECES, false, true);
        System.out.println(p3);

    }
}
