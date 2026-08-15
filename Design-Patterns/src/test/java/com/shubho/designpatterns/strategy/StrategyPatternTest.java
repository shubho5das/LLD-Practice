package com.shubho.designpatterns.strategy;

import org.junit.jupiter.api.Test;

public class StrategyPatternTest {

    @Test
    public void testVehiclesWithDifferentStrategies() {

        Vehicle passengerVehicle = new PassengerVehicle(new NormalDriveStrategy());
        
        Vehicle sportsVehicle = new SportsVehicle(new SportsDriveStrategy());

        Vehicle offroadVehicle = new OffroadVehicle(new OffroadDriveStrategy());

        Vehicle racingVehicle = new RacingVehicle(new SportsDriveStrategy());

        passengerVehicle.drive(); 
        sportsVehicle.drive();
        offroadVehicle.drive();
        racingVehicle.drive();
    }
}
