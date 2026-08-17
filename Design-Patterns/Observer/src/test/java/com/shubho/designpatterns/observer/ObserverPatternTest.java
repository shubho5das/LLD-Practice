package com.shubho.designpatterns.observer;

import org.junit.jupiter.api.Test;

public class ObserverPatternTest {

    @Test
    void shouldNotifyAllObservers() {

        WeatherStation weatherStation = new WeatherStation();

        DisplayObserver phoneDisplay = new PhoneDisplay();
        DisplayObserver tvDisplay = new TVDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);

        weatherStation.setTemperature(30);
    }

    @Test
    void shouldRemoveObserver() {

        WeatherStation weatherStation = new WeatherStation();

        DisplayObserver phoneDisplay = new PhoneDisplay();
        DisplayObserver tvDisplay = new TVDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);

        weatherStation.setTemperature(28);

        weatherStation.removeObserver(tvDisplay);

        weatherStation.setTemperature(36);
    }
}
