package com.shubho.designpatterns.decorator;

public class Latte implements Coffee {

    private int cost = 180;
    private String description = "Latte";

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
