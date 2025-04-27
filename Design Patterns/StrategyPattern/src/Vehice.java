import StrategyIntf.DriveStrategy;

import StrategyIntf.NormalDriveStrategy;
import StrategyIntf.SportDriveStrategy;
public class Vehice {

    DriveStrategy driveStrategy;

    Vehice(DriveStrategy driveObj){
        this.driveStrategy = driveObj;
    }

    public void drive(){
        driveStrategy.drive();
    }

}
