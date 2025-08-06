package Entities;

public class TurnOnAcCommand implements ICommand {
    AirConditioner airConditioner;

    

    public TurnOnAcCommand(AirConditioner ac) {
    this.airConditioner = ac;
    }



    @Override
    public void execute() {
        airConditioner.TurnOnAcCommand();
    }



    @Override
    public void undo() {
       airConditioner.TurnOffAcCommand();
    }
}
