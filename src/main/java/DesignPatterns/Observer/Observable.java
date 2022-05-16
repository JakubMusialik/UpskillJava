package DesignPatterns.Observer;

import DesignPatterns.Observer.Notifications.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();

}
