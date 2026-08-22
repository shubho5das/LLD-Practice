package com.shubho.designpatterns.decorator;

public class ChocolateDecorator extends CoffeeDecorator {

    private int cost = 25;
    private String description = "Chocolate";

    // Constructor

    public ChocolateDecorator(Coffee coffee) {
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
