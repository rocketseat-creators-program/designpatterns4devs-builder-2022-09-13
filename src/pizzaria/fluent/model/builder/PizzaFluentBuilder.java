package pizzaria.fluent.model.builder;

import pizzaria.fluent.model.Pizza;
import pizzaria.fluent.model.Size;

import java.util.Arrays;
import java.util.List;

public class PizzaFluentBuilder {

    //Mandatory
    protected Size size;

    //Optional
    protected List<String> toppings;
    protected List<String> sauces;
    protected boolean cheese;
    protected boolean pepper;

    public PizzaFluentBuilder(Size size) {
        this.size = size;
    }

    public PizzaFluentBuilder withSauces(String... sauces) {
        this.sauces = Arrays.asList(sauces);
        return this;
    }

    public PizzaFluentBuilder withToppings(String... toppings) {
        this.toppings = Arrays.asList(toppings);
        return this;
    }

    public PizzaFluentBuilder withCheese() {
        this.cheese = true;
        return this;
    }

    public PizzaFluentBuilder withPepper() {
        this.pepper = true;
        return this;
    }

    public Pizza now() {
        return new Pizza(toppings, sauces, size, cheese, pepper);
    }


}
