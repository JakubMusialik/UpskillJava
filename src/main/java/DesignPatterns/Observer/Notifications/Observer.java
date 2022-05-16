package DesignPatterns.Observer.Notifications;

import DesignPatterns.Observer.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatherForecast);
}
