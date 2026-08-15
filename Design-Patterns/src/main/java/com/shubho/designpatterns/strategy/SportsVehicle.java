package com.shubho.designpatterns.strategy;

public class SportsVehicle extends Vehicle {
    
    public SportsVehicle(DriveStrategy driveStrategy){
        super(driveStrategy);
    }
}
