package com.shubho.designpatterns.decorator;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    // Constructor

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

}
