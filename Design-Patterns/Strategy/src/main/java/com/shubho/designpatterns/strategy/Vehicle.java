package com.shubho.designpatterns.strategy;

public class Vehicle {
    
    private final DriveStrategy driveStrategy;

    // Constructor

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    // Methods

    public void drive() {
        driveStrategy.drive();
    }
}
