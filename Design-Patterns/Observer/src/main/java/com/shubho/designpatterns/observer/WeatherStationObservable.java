package com.shubho.designpatterns.observer;

public interface WeatherStationObservable {
    
    void addObserver(DisplayObserver observer);
    
    void removeObserver(DisplayObserver observer);
    
    void notifyObservers();

    void setTemperature(int temperature);
}
