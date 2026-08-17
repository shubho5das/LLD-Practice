package com.shubho.designpatterns.observer;

import java.util.List;
import java.util.ArrayList;

public class WeatherStation implements WeatherStationObservable {

    private int temperature;
    private List<DisplayObserver> observers;

    // Constructor

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    // Methods

    @Override
    public void addObserver(DisplayObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(DisplayObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (DisplayObserver observer : observers) {
            observer.update(temperature);
        }
    }

    @Override
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
