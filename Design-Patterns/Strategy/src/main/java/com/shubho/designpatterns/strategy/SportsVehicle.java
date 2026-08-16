package com.shubho.designpatterns.strategy;

public class SportsVehicle extends Vehicle {
    
    // Constructor
    
    public SportsVehicle(DriveStrategy driveStrategy){
        super(driveStrategy);
    }
}
