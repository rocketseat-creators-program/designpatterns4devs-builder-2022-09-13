package pizzaria.before.model;

import java.util.List;

public class Pizza {

    private List<String> toppings;
    private List<String> sauces;
    private Size size;
    private boolean cheese;
    private boolean pepper;

    public Pizza(Size size) {
        this.size = size;
    }

    public Pizza(List<String> sauces, Size size) {
        this.sauces = sauces;
        this.size = size;
    }

    public Pizza(List<String> toppings, List<String> sauces, Size size) {
        this.toppings = toppings;
        this.sauces = sauces;
        this.size = size;
    }

    public Pizza(List<String> toppings, List<String> sauces, Size size, boolean cheese) {
        this.toppings = toppings;
        this.sauces = sauces;
        this.size = size;
        this.cheese = cheese;
    }

    public Pizza(List<String> toppings, List<String> sauces, Size size, boolean cheese, boolean pepper) {
        this.toppings = toppings;
        this.sauces = sauces;
        this.size = size;
        this.cheese = cheese;
        this.pepper = pepper;
    }

    @Override
    public String toString() {
        return "Pizza [toppings=" + toppings + ", sauces=" + sauces + ", size=" + size + ", cheese=" + cheese
                + ", pepper=" + pepper + "]";
    }
}
