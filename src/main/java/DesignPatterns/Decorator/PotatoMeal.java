package DesignPatterns.Decorator;

public class PotatoMeal extends DecoratorMeal {

    @Override
    public void prepareMeal() {
        System.out.println("Przygotowuję danie na bazie ziemniaków.");
    }
}
