package States;

import Entities.Atm;
import Entities.Card;
import Entities.TransactionType;

public interface AtmState {

    default void insertCard(Atm atm, Card card){
        System.out.println("Not Operational");
    }

    default void authenticatePin(Atm atm,  int pin){
        System.out.println("Not Operational");
    }
    default void selectOperation(Atm atm,  TransactionType txnType){
        System.out.println("Not Operational");
    }
    default void cashWithdrawal(Atm atm,  int amount){
        System.out.println("Not Operational");
    }
    default void displayBalance(Atm atm){
        System.out.println("Not Operational");
    }
    default void returnCard(){
        System.out.println("Not Operational");
    }
    default void exit(Atm atm){
        System.out.println("Not Operational");
    }

}
