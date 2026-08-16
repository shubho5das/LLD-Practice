package com.shubho.designpatterns.strategy;

public class Vehicle {
    
    private DriveStrategy driveStrategy;

    // Constructor

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    // Methods

    public void drive() {
        driveStrategy.drive();
    }
}
