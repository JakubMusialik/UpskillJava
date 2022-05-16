package DesignPatterns.Decorator;

public class ChickenMealDecorator extends MealDecorator {

    public ChickenMealDecorator(DecoratorMeal decoratedMeal) {
        super(decoratedMeal);
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addChicken();
    }

    private void addChicken() {
        System.out.println("Do dania dodaję kurczaka.");
    }
}
