import java.util.HashMap;
import java.util.Map;

import Basic.Sprites;

public class RoboticFactory {

    private static Map<String, IRobot> roboticObjectCache = new HashMap<>();

    public static IRobot createRobot(String robotType){
        if(roboticObjectCache.containsKey(robotType)){
            return roboticObjectCache.get(robotType);
        } else{
            Sprites sprites = new Sprites();
            IRobot humanoidRobot = new HumanoidRobot(robotType, sprites);
            roboticObjectCache.put(robotType, humanoidRobot);
            return humanoidRobot;
        }
    }
    
}
