package com.shubho.designpatterns.strategy;

public class RacingVehicle extends Vehicle {
    
    public RacingVehicle(DriveStrategy driveStrategy){
        super(driveStrategy);
    }    
}
