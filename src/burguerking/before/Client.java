package burguerking.before;

import burguerking.before.model.BurgerKingMeal;

public class Client {

    public static void main(String[] args) {
        BurgerKingMeal burgerCombo = new BurgerKingMeal("Coke", "X-salad", "Fries");
        System.out.println(burgerCombo);

        BurgerKingMeal justFries = new BurgerKingMeal(null, null, "Fries");
        System.out.println(justFries);

        BurgerKingMeal fitnessCombo = new BurgerKingMeal("Milk Shake", "Monster Burguer", "Large Fries", "Fudge Cake", "2 Kilograms");
        System.out.println(fitnessCombo);
    }
}
