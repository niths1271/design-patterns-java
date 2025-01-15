package com.nithin.behavioral.strategy.drivestrategies;

public class EcoDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Eco Drive Strategy!!!");
    }

}
