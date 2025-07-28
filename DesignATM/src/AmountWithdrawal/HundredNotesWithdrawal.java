package AmountWithdrawal;

import Entities.Atm;

public class HundredNotesWithdrawal extends CashWithdrawProcessor{

    public HundredNotesWithdrawal(CashWithdrawProcessor nexCashWithdrawProcessor) {
        super(nexCashWithdrawProcessor);
        
    }
    public boolean getCash(int amount, Atm atm) {
        if (amount > atm.getAtmBalance()) return false;

        int availableNotes = atm.getOneHundredNotes();
        int requiredNotes = amount / 100;

        int notesUsed = Math.min(requiredNotes, availableNotes);
        int dispensedAmount = notesUsed * 100;
        int remainingAmount = amount - dispensedAmount;

        if (remainingAmount == 0 || super.getCash(remainingAmount, atm)) {
            atm.setTwoKNotes(availableNotes - notesUsed);
            atm.setAtmBalance(atm.getAtmBalance() - (amount-dispensedAmount ));
            return true;
        }

        return false;
    }


    
}
