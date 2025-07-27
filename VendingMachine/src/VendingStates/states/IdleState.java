package VendingStates.states;

import java.util.ArrayList;

import Entitys.VendingMachine;
import VendingStates.State;

public class IdleState implements State{

    public IdleState(){
        System.out.println("Currently machine is in idle state");
    }

    public IdleState(VendingMachine vMachine){
        System.out.println("Currently machine is in idle state");
        vMachine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine){
        vendingMachine.setVendingMachineState(new HasMoneyState());
    }
    
}
