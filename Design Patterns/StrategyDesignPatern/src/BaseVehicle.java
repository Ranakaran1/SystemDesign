import StrategyIntf.DriveStrastegy;

public class BaseVehicle {

    DriveStrastegy driveStrastegy;

    BaseVehicle(DriveStrastegy drive){
        this.driveStrastegy = drive;
    }

    public void drive(){
        driveStrastegy.drive();
    }

    public void display(){
        System.out.println("Base Vehicle");
    }


    
}