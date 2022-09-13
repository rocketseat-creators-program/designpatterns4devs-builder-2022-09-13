package pizzaria.after.model;

import java.util.List;

public class ClassicPizza extends Pizza {

    public ClassicPizza(List<String> toppings, List<String> sauces, Size size, boolean cheese, boolean pepper) {
        super(toppings, sauces, size, cheese, pepper);
    }

    @Override
    public String toString() {
        return "ClassicPizza [toppings=" + toppings + ", sauces=" + sauces + ", size=" + size + ", cheese=" + cheese
                + ", pepper=" + pepper + "]";
    }
}
