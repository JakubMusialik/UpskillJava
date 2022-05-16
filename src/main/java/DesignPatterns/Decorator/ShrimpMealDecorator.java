package DesignPatterns.Decorator;

public class ShrimpMealDecorator extends MealDecorator {

    public ShrimpMealDecorator(DecoratorMeal decoratedMeal) {
        super(decoratedMeal);
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addShrimp();
    }

    private void addShrimp() {
        System.out.println("Do dania dodaję krewetki.");
    }
}
