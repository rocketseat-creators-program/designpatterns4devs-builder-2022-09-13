package burguerking.after.builder;

public class FitnessMenuBuilder extends  BurgerKingMealBuilder {

    @Override
    public void buildDrink() {
        meal.setDrink("Orange juice");
    }

    @Override
    public void buildMain() {
        meal.setMain("Veggie Burger");
    }

    @Override
    public void buildSide() {
        // no side
    }

    @Override
    public void buildDessert() {
        // no main
    }

    @Override
    public void buildGift() {
        meal.setToy("Crown");
    }
}
