package com.shubho.designpatterns.strategy;

import org.junit.jupiter.api.Test;

public class StrategyPatternTest {

    @Test
    public void testVehiclesWithDifferentStrategies() {

        Vehicle passengerVehicle = new PassengerVehicle();
        
        Vehicle sportsVehicle = new SportsVehicle();

        Vehicle offroadVehicle = new OffroadVehicle();

        Vehicle racingVehicle = new RacingVehicle();

        passengerVehicle.drive(); 
        sportsVehicle.drive();
        offroadVehicle.drive();
        racingVehicle.drive();
    }
}
