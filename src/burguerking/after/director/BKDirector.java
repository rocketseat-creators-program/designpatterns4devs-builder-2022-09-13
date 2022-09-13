package burguerking.after.director;

import burguerking.after.builder.BurgerKingMealBuilder;
import burguerking.after.model.BurgerKingMeal;

public class BKDirector {

    private BurgerKingMealBuilder builder;

    public BKDirector(BurgerKingMealBuilder builder) {
        this.builder = builder;
    }

    public void constructCombo() {
        builder.buildDrink();
        builder.buildMain();
        builder.buildSide();
        builder.buildDessert();
        builder.buildGift();
    }

    public BurgerKingMeal getCombo() {
        return builder.getMeal();
    }
}
