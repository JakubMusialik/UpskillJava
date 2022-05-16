package DesignPatterns.AbstractFactory.Cars;

import DesignPatterns.AbstractFactory.SteeringWheelPosition;

public class Tesla extends Car{

    public Tesla(String productionYear, String engine, String fuel, SteeringWheelPosition position) {
        super(productionYear, engine, fuel, position);
    }

}
