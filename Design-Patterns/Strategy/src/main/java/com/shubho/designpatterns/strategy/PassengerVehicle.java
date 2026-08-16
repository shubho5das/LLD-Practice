package com.shubho.designpatterns.strategy;

public class PassengerVehicle extends Vehicle {
    
    // Constructor

    public PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
