package States;

import AmountWithdrawal.CashWithdrawProcessor;
import AmountWithdrawal.HundredNotesWithdrawal;
import AmountWithdrawal.TwoKNotesWithdrawal;
import AmountWithdrawal.fiveHundredWithdrawal;
import Entities.Atm;

public class CashWithdrawalState implements AtmState {
    CashWithdrawProcessor cashWithdrawProcessor; 

    CashWithdrawalState(){
        System.out.println("Currently in CashWithdrawalState state");
    }

    public void cashWithdrawal(Atm atm,  int amount){
        if(atm.getCard().getUserBankAccount().getBalance()< amount){
            System.out.println("Insufficient balance");
            atm.setCurrentStates(new IdleState());
            return;
        }
        cashWithdrawProcessor  = new TwoKNotesWithdrawal(new fiveHundredWithdrawal(new HundredNotesWithdrawal(null)) );
        boolean status = cashWithdrawProcessor.getCash(amount, atm);

        if(status==true){
            System.out.println("Withdrawal Successful");
            
        }else {
            System.out.println("Withdrawal Unsuccessful");
        }

        atm.setCurrentStates(new IdleState());

    }


}
