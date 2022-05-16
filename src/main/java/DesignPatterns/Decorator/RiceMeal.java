package DesignPatterns.Decorator;

public class RiceMeal extends DecoratorMeal {

    @Override
    public void prepareMeal() {
        System.out.println("Przygotowuję danie na bazie ryżu.");
    }
}