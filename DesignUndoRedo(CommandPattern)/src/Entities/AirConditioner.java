package Entities;

public class AirConditioner {

    boolean isOn;

    public void TurnOffAcCommand(){
        System.out.println("AC turned Off");
        this.isOn = false;
    }

    public void TurnOnAcCommand(){
        System.out.println("AC turned On");
        this.isOn = true;
    }
}