package com.shubho.designpatterns.strategy;

public class OffroadVehicle extends Vehicle {
    
    public OffroadVehicle(DriveStrategy driveStrategy){
        super(driveStrategy);
    }
}
