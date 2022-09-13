package pizzaria.after.model;

import java.util.List;

public class MiniPizza extends Pizza {

    public MiniPizza(List<String> toppings, List<String> sauces, Size size, boolean cheese, boolean pepper) {
        super(toppings, sauces, size, cheese, pepper);
    }

    @Override
    public String toString() {
        return "MiniPizza [toppings=" + toppings + ", sauces=" + sauces + ", size=" + size + ", cheese=" + cheese
                + ", pepper=" + pepper + "]";
    }
}
