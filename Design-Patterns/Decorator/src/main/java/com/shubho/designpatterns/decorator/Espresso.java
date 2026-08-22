package com.shubho.designpatterns.decorator;

public class Espresso implements Coffee {

    private int cost = 100;
    private String description = "Espresso";

    // Methods

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }    
    
}
