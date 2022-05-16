package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.Cars.*;

public class EuropeanFactory implements Factory {

    SteeringWheelPosition position = SteeringWheelPosition.LEFT;

    @Override
    public Car buildTesla(TeslaModel model) {
        switch (model) {
            case MODEL_3 -> {
                return new Tesla("2022", "Duracel", "Electric", position);
            }
            case MODEL_S -> {
                return new Tesla("2021","Duracel","Electric",position);
            }
            case MODEL_X -> {
                return new Tesla("2020","Duracel","Electric",position);
            }
            default -> throw new IllegalStateException("No such model");
        }
    }

    @Override
    public Car buildBMW(BMWModel model) {
        switch (model){
            case X5 -> {
                return new BMW("2011","3.2","Diesel",position);
            }
            case E60 -> {
                return new BMW("2014","2.8","Hybrid",position);
            }
            case E92 -> {
                return new BMW("2012","1.9","Gas",position);
            }
            default -> throw new IllegalStateException("No such model");
        }
    }
}
