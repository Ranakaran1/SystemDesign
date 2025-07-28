package States;

import Entities.Atm;

public class HasCardState implements AtmState {


    HasCardState(){
        System.out.println("Currently in HasCardState state");
    }

    @Override
    public void authenticatePin(Atm atm, int pin){
        if(atm.getCard().getPin() == pin){
            atm.setCurrentStates(new OperationState());
        }
    }

    
}
