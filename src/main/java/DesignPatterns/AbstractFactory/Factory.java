package DesignPatterns.AbstractFactory;

import DesignPatterns.AbstractFactory.Cars.*;

public interface Factory {

    Car buildTesla(TeslaModel tesla);
    Car buildBMW(BMWModel bmw);
}
