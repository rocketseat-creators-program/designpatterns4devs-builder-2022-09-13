package burguerking.after.builder;

public class FamilyMenuBuilder extends BurgerKingMealBuilder {

    @Override
    public void buildDrink() {
        meal.setDrink("Coke");
    }

    @Override
    public void buildMain() {
        meal.setMain("CheddarBurger");
    }

    @Override
    public void buildSide() {
        meal.setSide("Fries");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("2 ice creams");
    }

    @Override
    public void buildGift() {
        meal.setToy("2 fluffy dogs");
    }
}
