public class Vehicle {
    DriveInf driveInf;

    public Vehicle(DriveInf driveInf) {
        this.driveInf = driveInf;
    }

    public void drive(){
        driveInf.drive();
    }

}
