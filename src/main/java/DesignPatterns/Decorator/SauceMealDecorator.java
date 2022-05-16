package DesignPatterns.Decorator;

public class SauceMealDecorator extends MealDecorator {

    public SauceMealDecorator(DecoratorMeal decoratedMeal) {
        super(decoratedMeal);
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addSauce();
    }

    private void addSauce() {
        System.out.println("Danie polewam sosem.");
    }
}
