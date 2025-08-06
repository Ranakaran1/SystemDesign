import Entities.AirConditioner;
import Entities.MyRemoteControl;
import Entities.TurnOfAcCommand;
import Entities.TurnOnAcCommand;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        AirConditioner airConditioner = new AirConditioner();

        MyRemoteControl remoteControl = new MyRemoteControl();
        remoteControl.setCommand(new TurnOnAcCommand(airConditioner));
        remoteControl.pressButton();

        remoteControl.setCommand(new TurnOfAcCommand(airConditioner));
        remoteControl.pressButton();
        System.out.println("Before Undo");
        remoteControl.undo();
        remoteControl.undo();
    }
}
