package AmountWithdrawal;

import Entities.Atm;

public abstract class CashWithdrawProcessor {
    
    CashWithdrawProcessor nexCashWithdrawProcessor;

    public CashWithdrawProcessor(CashWithdrawProcessor nexCashWithdrawProcessor) {
        this.nexCashWithdrawProcessor = nexCashWithdrawProcessor;
    }

    public boolean getCash(int amount, Atm atm){
        if(nexCashWithdrawProcessor != null){
            return nexCashWithdrawProcessor.getCash(amount, atm);
        }
        return false;

    }

    
}
