package com.nithin.behavioral.strategy.drivestrategies;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy!!!");
    }

}
