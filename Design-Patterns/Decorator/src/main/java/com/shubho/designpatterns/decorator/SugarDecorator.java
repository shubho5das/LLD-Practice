package com.shubho.designpatterns.decorator;

public class SugarDecorator extends CoffeeDecorator {

    private int cost = 5;
    private String description = "Sugar";

    // Constructor

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    // Methods

    @Override
    public int getCost() {
        return coffee.getCost() + cost;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", " + description;
    }
    
}
