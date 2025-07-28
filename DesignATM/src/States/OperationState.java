package States;

import Entities.Atm;
import Entities.TransactionType;

public class OperationState implements AtmState {
    OperationState(){
        System.out.println("Currently in OperationState state");
    }

    @Override
    public void selectOperation(Atm atm, TransactionType txnType){

        switch (txnType) {
            case CASH_WITHDRAWAL:
                atm.setCurrentStates(new CashWithdrawalState());
                break;
            case BALANCE_CHECK:
                atm.setCurrentStates(new CheckBalanceState());
                break;
        
            default:
                System.out.println("Invalid transaction type");
                exit(atm);
                break;
        }
        
    }
    @Override
     public void exit(Atm atm){
        System.out.println("Collect your card");
        atm.setCurrentStates(new IdleState());
        System.out.println("Exit");
    }


}
