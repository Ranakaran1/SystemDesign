public class Motorcycle implements Bike{
    boolean isEngineOn;
    int speed=0;


    @Override
    public void turnOnEngine() {
        System.out.println("turning on Motorcycle Engine");
        isEngineOn = true;
    }

    @Override
    public void accelerate() {
        this.speed +=10;
        System.out.println("Accelerating Motorcycle with speed: "+ speed);
    }


}
