package com.shubho.designpatterns.strategy;

public class PassengerVehicle extends Vehicle {
    
    public PassengerVehicle(DriveStrategy driveStrategy){
        super(driveStrategy);
    }
}
