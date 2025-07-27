package VendingStates.states;

import java.util.List;

import Entitys.Coin;
import Entitys.Item;
import Entitys.VendingMachine;
import VendingStates.State;

public class SelectionState implements State{
    
     public SelectionState(){
        System.out.println("Currently machine is in SelectionState");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception{

        Item item = vendingMachine.getInventry().getItem(code);
        int totalUserMoney =0;

        List<Coin> coins = vendingMachine.getCoinList();

        for(Coin coin : coins ){
            totalUserMoney += coin.value;
        }
        if(totalUserMoney < item.getPrice()){
            System.out.println("Insufficient Amount, Money has refunded");
            refundFullMoney(vendingMachine);
            vendingMachine.setVendingMachineState(new IdleState());
        } else if(totalUserMoney >= item.getPrice()){
            if(totalUserMoney > item.getPrice()){
                getChange(totalUserMoney- item.getPrice());
            }
            vendingMachine.setVendingMachineState(new DispenseState(vendingMachine, code));
        } 

    }

    @Override
    public int getChange(int extraAmt){
        System.out.println("Refunded extra amount");
        return extraAmt;

    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vMachine){
        vMachine.setVendingMachineState(new IdleState());
        return vMachine.getCoinList();
    }


}
