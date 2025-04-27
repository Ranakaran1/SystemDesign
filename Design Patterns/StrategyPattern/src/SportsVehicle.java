import StrategyIntf.SportDriveStrategy;

public class SportsVehicle extends Vehice {

    SportsVehicle(){
        super(new SportDriveStrategy());
    }

}
