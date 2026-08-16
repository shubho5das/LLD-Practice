package com.shubho.designpatterns.strategy;

public class RacingVehicle extends Vehicle {
    
    // Constructor

    public RacingVehicle(){
        super(new SportsDriveStrategy());
    }    
}
