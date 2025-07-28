package States;

import Entities.Atm;
import Entities.Card;

public class IdleState implements AtmState{

    public IdleState(){
        System.out.println("Currently in Idle State");
    }

    @Override
    public void insertCard(Atm atm, Card card){
        atm.setCard(card);
        atm.setCurrentStates(new HasCardState());
        System.out.println("Card inserted");
    }

    
}
