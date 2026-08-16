package com.shubho.designpatterns.strategy;

public class OffroadDriveStrategy implements DriveStrategy{
    
    @Override
    public void drive() {
        System.out.println("Driving off-road...");
    }
}
