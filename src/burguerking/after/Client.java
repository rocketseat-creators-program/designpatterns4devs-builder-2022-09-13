package burguerking.after;

import burguerking.after.builder.*;
import burguerking.after.director.BKDirector;

public class Client {

    public static void order(String name, BurgerKingMealBuilder builder) {
        System.out.println("Ordering a " + name);
        BKDirector director = new BKDirector(builder);
        director.constructCombo();
        System.out.println(director.getCombo());

        System.out.println("------------------");
    }

    public static void main(String[] args) {
        order("Monday Menu today!", new MondayMenuBuilder());
        order("Today is friday baby!", new FridayMenuBuilder());
        order("One Family Menu, please.", new FamilyMenuBuilder());
        order("today I'm fitness...", new FitnessMenuBuilder());
    }
}
