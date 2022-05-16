package DesignPatterns.Factory;

import DesignPatterns.Factory.Meals.Meal;

abstract class Factory {

    abstract public Meal createMeal(MealType mealType);

}
