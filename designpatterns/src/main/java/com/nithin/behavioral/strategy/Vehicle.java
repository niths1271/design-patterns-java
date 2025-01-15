package com.nithin.behavioral.strategy;

import com.nithin.behavioral.strategy.drivestrategies.DriveStrategy;

class Vehicle{
    DriveStrategy strategy;

    public Vehicle(DriveStrategy strategy){
        this.strategy=strategy;
    }

    public void drive(){
        strategy.drive();
    }
}