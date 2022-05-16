package DesignPatterns.AbstractFactory.Cars;

import DesignPatterns.AbstractFactory.SteeringWheelPosition;

public abstract class Car {

    private final String productionYear;
    private final String engine;
    private final String fuel;
    private final SteeringWheelPosition position;

    protected Car(String productionYear, String engine, String fuel, SteeringWheelPosition position) {
        this.productionYear = productionYear;
        this.engine = engine;
        this.fuel = fuel;
        this.position = position;
    }

    public SteeringWheelPosition getSteeringWheelPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Car{" +
                "productionYear='" + productionYear + '\'' +
                ", engine='" + engine + '\'' +
                ", fuel='" + fuel + '\'' +
                ", position=" + position +
                '}';
    }
}
