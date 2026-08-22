package com.shubho.designpatterns.decorator;

import org.junit.jupiter.api.Test;

public class DecoratorPatternTest {

    @Test
    void shouldServeCustomers() {

        // Customer 1

        Coffee coffee1 = new Cappuccino();
        coffee1 = new MilkDecorator(coffee1);
        coffee1 = new SugarDecorator(coffee1);

        System.out.println("Customer 1: " + coffee1.getDescription() + " | Cost: " + coffee1.getCost());

        // Customer 2

        Coffee coffee2 = new Espresso();
        coffee2 = new MilkDecorator(coffee2);
        coffee2 = new ChocolateDecorator(coffee2);
        coffee2 = new SugarDecorator(coffee2);

        System.out.println("Customer 2: " + coffee2.getDescription() + " | Cost: " + coffee2.getCost());


        // Customer 3

        Coffee coffee3 = new Latte();
        coffee3 = new ChocolateDecorator(coffee3);

        System.out.println("Customer 3: " + coffee3.getDescription() + " | Cost: " + coffee3.getCost());
    }
    
}
