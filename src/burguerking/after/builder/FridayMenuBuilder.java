package burguerking.after.builder;

public class FridayMenuBuilder extends BurgerKingMealBuilder {

    @Override
    public void buildDrink() {
        meal.setDrink("Coke");
    }

    @Override
    public void buildMain() {
        meal.setMain("x-everything");
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
