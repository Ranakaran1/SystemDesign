package AmountWithdrawal;

import Entities.Atm;

public class fiveHundredWithdrawal extends CashWithdrawProcessor {

    public fiveHundredWithdrawal(CashWithdrawProcessor nexCashWithdrawProcessor) {
        super(nexCashWithdrawProcessor);
    }
    
    public boolean getCash(int amount, Atm atm) {
        if (amount > atm.getAtmBalance()) return false;

        int availableNotes = atm.getFiveHundredNotes();
        int requiredNotes = amount / 500;
        
        int notesUsed = Math.min(requiredNotes, availableNotes);
        int dispensedAmount = notesUsed * 500;
        int remainingAmount = amount - dispensedAmount;

        if (remainingAmount == 0 || super.getCash(remainingAmount, atm)) {
            atm.setFiveHundredNotes(availableNotes - notesUsed);
            atm.setAtmBalance(atm.getAtmBalance() - (amount-dispensedAmount ));
            return true;
        }

        return false;
    }
    
}
