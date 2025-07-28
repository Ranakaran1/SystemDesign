package States;

import Entities.Atm;

public class CheckBalanceState implements AtmState {

    CheckBalanceState(){
        System.out.println("Currently in CheckBalanceState state");
    }

    public void displayBalance(Atm atm){
        System.out.println("balance is" + atm.getCard().getUserBankAccount().getBalance());
        atm.setCurrentStates(new IdleState());
    }
}
