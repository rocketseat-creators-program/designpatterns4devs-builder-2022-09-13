package pizzaria.after.model.builder;

import pizzaria.after.model.ClassicPizza;
import pizzaria.after.model.MiniPizza;

public class MiniPizzaBuilder extends PizzasFeaturesOpt {

    public MiniPizza getResult() {
        return new MiniPizza(toppings, sauces, size, cheese, pepper);
    }
}
