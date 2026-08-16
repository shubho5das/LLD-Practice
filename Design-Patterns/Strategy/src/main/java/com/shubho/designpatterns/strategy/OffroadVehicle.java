package com.shubho.designpatterns.strategy;

public class OffroadVehicle extends Vehicle {
    
    // Constructor

    public OffroadVehicle(){
        super(new OffroadDriveStrategy());
    }
}
