package DesignPatterns.Observer.Notifications;

import DesignPatterns.Observer.WeatherForecast;

public class TvNews implements Observer {

    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Telewizja - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature() + " stopni, ciśnienie: " + weatherForecast.getPressure() + "hPa");
    }

}