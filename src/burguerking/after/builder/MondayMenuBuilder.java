package burguerking.after.builder;

public class MondayMenuBuilder extends BurgerKingMealBuilder {

    @Override
    public void buildDrink() {
        meal.setDrink("Water");
    }

    @Override
    public void buildMain() {
        meal.setMain("x-salad");
    }

    @Override
    public void buildSide() {
        meal.setSide("Fries");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Cake");
    }

    @Override
    public void buildGift() {
        meal.setToy("Cellphone toy");
    }
}
