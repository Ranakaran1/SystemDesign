import StrategyIntf.NormalDriveStrategy;

public class GoodsVehice extends Vehice {

    GoodsVehice(){
        super(new NormalDriveStrategy());
    }

}
