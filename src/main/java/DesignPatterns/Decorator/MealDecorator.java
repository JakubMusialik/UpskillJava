package DesignPatterns.Decorator;

public abstract class MealDecorator extends DecoratorMeal {

    DecoratorMeal meal;

    MealDecorator(DecoratorMeal meal) {
        this.meal = meal;
    }

    @Override
    public void prepareMeal() {
        this.meal.prepareMeal();
    }
}