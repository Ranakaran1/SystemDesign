import StrategyIntf.DriveStrastegy;
import StrategyIntf.SprotsDrive;

public class App {
    public static void main(String[] args) throws Exception {
        DriveStrastegy strategy = new SprotsDrive();

        BaseVehicle baseVehicle = new ClassicVehicle(strategy);
        baseVehicle.drive();

   }
}
