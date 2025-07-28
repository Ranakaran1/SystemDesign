package AmountWithdrawal;

import Entities.Atm;

public class TwoKNotesWithdrawal extends CashWithdrawProcessor {
    
    public TwoKNotesWithdrawal(CashWithdrawProcessor processor) {
        super(processor);
    }


    
    public boolean getCash(int amount, Atm atm) {
        if (amount > atm.getAtmBalance()) return false;

        int availableNotes = atm.getTwoKNotes();
        int requiredNotes = amount / 2000;

        int notesUsed = Math.min(requiredNotes, availableNotes);
        int dispensedAmount = notesUsed * 2000;
        int remainingAmount = amount - dispensedAmount;

        if (remainingAmount == 0 || super.getCash(remainingAmount, atm)) {
            atm.setTwoKNotes(availableNotes - notesUsed);
            atm.setAtmBalance(atm.getAtmBalance() - (amount-dispensedAmount ));
            return true;
        }

        return false;
    }

}
