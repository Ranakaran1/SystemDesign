package Entitys;
import java.util.ArrayList;
import java.util.List;

import VendingStates.State;
import VendingStates.states.IdleState;

public class VendingMachine {


    private State vendingMachineState;
    private Inventry inventry;
    private List<Coin> coinList;

    public VendingMachine(){
        vendingMachineState = new IdleState();
        inventry = new Inventry(10);
        coinList = new ArrayList<>();
    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Inventry getInventry() {
        return inventry;
    }

    public void setInventry(Inventry inventry) {
        this.inventry = inventry;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    
    
    
}
