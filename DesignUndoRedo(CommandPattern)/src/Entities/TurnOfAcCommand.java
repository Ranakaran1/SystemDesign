package Entities;

public class TurnOfAcCommand implements ICommand {

    AirConditioner airConditioner;

    

    public TurnOfAcCommand(AirConditioner ac) {
        this.airConditioner = ac;
    }



    @Override
    public void execute() {
        airConditioner.TurnOffAcCommand();
    }



    @Override
    public void undo() {
        airConditioner.TurnOnAcCommand();
    }
    
}
