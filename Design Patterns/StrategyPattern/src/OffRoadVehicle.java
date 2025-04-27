import StrategyIntf.*;

public class OffRoadVehicle extends Vehice{

    OffRoadVehicle(){
        super( new SportDriveStrategy());
    }


}
