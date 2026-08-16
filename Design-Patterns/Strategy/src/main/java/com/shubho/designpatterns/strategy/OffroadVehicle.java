package com.shubho.designpatterns.strategy;

public class OffroadVehicle extends Vehicle {
    
    // Constructor
    
    public OffroadVehicle(DriveStrategy driveStrategy){
        super(driveStrategy);
    }
}
