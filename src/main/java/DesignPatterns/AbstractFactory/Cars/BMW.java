package DesignPatterns.AbstractFactory.Cars;

import DesignPatterns.AbstractFactory.SteeringWheelPosition;

public class BMW extends Car{

    public BMW(String productionYear, String engine, String fuel, SteeringWheelPosition position) {
        super(productionYear, engine, fuel, position);
    }
}
