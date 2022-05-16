package DesignPatterns.Factory;

import DesignPatterns.Factory.Meals.Drugie;
import DesignPatterns.Factory.Meals.Meal;
import DesignPatterns.Factory.Meals.Podwieczorek;
import DesignPatterns.Factory.Meals.Zupa;

public class MealFactory extends Factory {

    @Override
    public Meal createMeal(MealType mealType) {
        switch (mealType) {
            case ZUPA -> {
                return new Zupa("Pomidorowa", 350, 25);
            }
            case DRUGIE_DANIE -> {
                return new Drugie("Schabowy", 500, 30);
            }
            case PODWIECZOREK -> {
                return new Podwieczorek("Lody", 250, 15);
            }
            default -> throw new UnsupportedOperationException("No such meal type");
        }
    }
}
