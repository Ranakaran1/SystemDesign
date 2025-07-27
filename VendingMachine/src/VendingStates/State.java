package VendingStates;

import java.util.List;

import Entitys.Coin;
import Entitys.Item;
import Entitys.VendingMachine;

public interface State {

    default void clickOnInsertCoinButton(VendingMachine vMachine) throws Exception{
        System.out.println("Not Operational");
    }

    default void insertCoin(VendingMachine vMachine, Coin coin) throws Exception {
        System.out.println("Not Operational");
    }

    default void clickOnStartProductSelectionButton(VendingMachine vMachine){
        System.out.println("Not Operational");
    }

    default void chooseProduct(VendingMachine vMachinem, int productCode) throws Exception{
        System.out.println("Not Operational");
    }

    default int getChange(int returnMoney){
        System.out.println("Not Operational");
        return 0;
    }
    default List<Coin> refundFullMoney(VendingMachine vMachine){
        System.out.println("Not Operational");
        return null;
    }

    default void cancelOperation(){
        System.out.println("Not Operational");
    }

    default Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception{
        System.out.println("Not Operational");
        return null;
    }
    
}
