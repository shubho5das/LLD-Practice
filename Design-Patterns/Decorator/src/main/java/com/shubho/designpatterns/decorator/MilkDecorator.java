package com.shubho.designpatterns.decorator;

public class MilkDecorator extends CoffeeDecorator {

    private int cost = 15;
    private String description = "Milk";

    // Constructor

    public MilkDecorator(Coffee coffee) {
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
