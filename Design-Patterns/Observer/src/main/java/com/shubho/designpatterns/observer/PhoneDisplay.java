package com.shubho.designpatterns.observer;

public class PhoneDisplay implements DisplayObserver {

    private int temperature;

    // Constructor

    public PhoneDisplay() {
        this.temperature = 0;
    }

    // Methods

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("Phone Display: Current Temperature is " + temperature + "°C");
    }
    
}
