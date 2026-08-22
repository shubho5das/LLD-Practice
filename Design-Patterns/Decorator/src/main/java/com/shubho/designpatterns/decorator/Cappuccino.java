package com.shubho.designpatterns.decorator;

public class Cappuccino implements Coffee {

    private int cost = 150;
    private String description = "Cappuccino";

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
