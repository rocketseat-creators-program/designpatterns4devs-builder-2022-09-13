package burguerking.after.builder;

import burguerking.after.model.BurgerKingMeal;

public abstract class BurgerKingMealBuilder {

    protected BurgerKingMeal meal;

    public BurgerKingMealBuilder() {
        meal = new BurgerKingMeal();
    }

    public BurgerKingMeal getMeal() {
        return meal;
    }

    public abstract void buildDrink();
    public abstract void buildMain();
    public abstract void buildSide();
    public abstract void buildDessert();
    public abstract void buildGift();
}
