package com.shubho.designpatterns.strategy;

public class NormalDriveStrategy implements DriveStrategy {
    
    @Override
    public void drive() {
        System.out.println("Driving normally...");
    }
}
