package Basic;

public class BasicMain {
    public static void main(String[] args) {
        int x=0;
        int y =0;

        for(int i=0;i<100;i++){
            Sprites sprites = new Sprites();
            Robot humanRobot = new Robot(x+i, y+i, "Humanoid", sprites);
            Sprites roboticDogSprites = new Sprites();
            Robot roboticDogSprite = new Robot(x+i, y+i, "ROBOT DOGS", roboticDogSprites);
        }
        System.out.println("Completed");
    }
}
