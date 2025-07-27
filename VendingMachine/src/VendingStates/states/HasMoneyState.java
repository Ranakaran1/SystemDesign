package VendingStates.states;

import java.util.List;

import Entitys.Coin;
import Entitys.VendingMachine;
import VendingStates.State;

public class HasMoneyState implements State{
    public HasMoneyState(){
        System.out.println("Currently machine is in HasMoneyState");
    }

    @Override
    public void insertCoin(VendingMachine vMachine, Coin coin){
        System.out.println("Accepted Coin");
        vMachine.getCoinList().add(coin);
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vMachine){
        vMachine.setVendingMachineState(new SelectionState());
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vMachine){
        vMachine.setVendingMachineState(new IdleState());
        return vMachine.getCoinList();
    }
}
