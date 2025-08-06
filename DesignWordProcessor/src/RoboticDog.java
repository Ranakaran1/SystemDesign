
import Basic.Sprites;

public class RoboticDog implements IRobot {

    String type;
    Sprites body;

    

    public RoboticDog (String type, Sprites body) {
        this.type = type;
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Sprites getBody() {
        return body;
    }

    public void setBody(Sprites body) {
        this.body = body;
    }

    @Override
    public void display(int x, int y) {
         System.out.println("Displayed at x: "+ x+ " y: "+ y);
    }
    
}
