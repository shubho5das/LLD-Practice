package com.shubho.designpatterns.observer;

public class TVDisplay implements DisplayObserver {

    private int temperature;

    // Constructor

    public TVDisplay() {
        this.temperature = 0;
    }

    // Methods

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("TV Display: Current Temperature is " + temperature + "°C");
    }
    
}
