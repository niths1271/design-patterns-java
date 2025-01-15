package com.nithin.behavioral.strategy;

import com.nithin.behavioral.strategy.drivestrategies.DriveStrategy;
import com.nithin.behavioral.strategy.drivestrategies.EcoDriveStrategy;
import com.nithin.behavioral.strategy.drivestrategies.NormalDriveStrategy;
import com.nithin.behavioral.strategy.drivestrategies.SportsDriveStrategy;

class main{
    public static void main(String[] args) {
        
        DriveStrategy sportsMode = new SportsDriveStrategy();
        Vehicle landrover = new Vehicle(sportsMode);
        System.out.print("LandRover has the drive Strategy:");
        landrover.drive();

        DriveStrategy ecoMode = new EcoDriveStrategy();
        Vehicle wagonr = new Vehicle(ecoMode);
        System.out.print("WagonR has the drive Strategy:");
        wagonr.drive();

        DriveStrategy normalMode = new NormalDriveStrategy();
        Vehicle swift = new Vehicle(normalMode);
        System.out.print("Swift has the drive Strategy:");
        swift.drive();
    }
}
