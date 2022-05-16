package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.Cars.*;

public class BritishFactory implements Factory{

    SteeringWheelPosition position = SteeringWheelPosition.RIGHT;

    @Override
    public Car buildTesla(TeslaModel model) {
        switch (model) {
            case MODEL_3 -> {
                return new Tesla("2020", "Duracel", "Electric", position);
            }
            case MODEL_S -> {
                return new Tesla("2021","Duracel","Electric",position);
            }
            case MODEL_X -> {
                return new Tesla("2023","Duracel","Electric",position);
            }
            default -> throw new IllegalStateException("No such model");
        }
    }

    @Override
    public Car buildBMW(BMWModel model) {
        switch (model){
            case X5 -> {
                return new BMW("2002","3.0","Diesel",position);
            }
            case E60 -> {
                return new BMW("2010","2.5","Hybrid",position);
            }
            case E92 -> {
                return new BMW("2018","1.6","Gas",position);
            }
            default -> throw new IllegalStateException("No such model");
        }
    }
}
