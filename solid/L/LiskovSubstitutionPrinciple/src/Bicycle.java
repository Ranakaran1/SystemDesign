public class Bicycle implements Bike {
    private int speed;
    @Override
    public void turnOnEngine() {
        // No Engine
            
    }

    @Override
    public void accelerate() {
       this.speed+=5;
       System.out.println("speed is: "+ speed); 
    }


}
