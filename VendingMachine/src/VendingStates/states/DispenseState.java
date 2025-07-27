package VendingStates.states;

import Entitys.Item;
import Entitys.VendingMachine;
import VendingStates.State;

public class DispenseState implements State{
    public DispenseState(){
        System.out.println("Currently product is in Dispenced state");
        
    }
    public DispenseState(VendingMachine vMachine , int code) throws Exception{
        System.out.println("Currently product is in Dispenced state");
        this.dispenseProduct(vMachine, code);
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception{
        Item item = vendingMachine.getInventry().getItem(code);
        vendingMachine.getInventry().updateSoldOut(code);
        vendingMachine.setVendingMachineState(new IdleState());
        return item;
    }
}
