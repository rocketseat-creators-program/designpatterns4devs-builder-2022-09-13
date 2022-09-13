package pizzaria.after.model.builder;

import pizzaria.after.model.ClassicPizza;
import pizzaria.after.model.Pizza;

public class ClassicPizzaBuilder extends PizzasFeaturesOpt {

    public ClassicPizza getResult() {
        return new ClassicPizza(toppings, sauces, size, cheese, pepper);
    }
}
