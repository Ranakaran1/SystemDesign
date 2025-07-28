import Entities.Atm;
import Entities.Card;
import Entities.TransactionType;
import Entities.User;
import Entities.UserBankAccount;

public class App {
    public static void main(String[] args) throws Exception {
        UserBankAccount userBankAccount = new UserBankAccount(4200);
        Card card = new Card();
        card.setUserBankAccount(userBankAccount);
        card.setCvv(121);
        card.setPin(121);

        User user = new User();
        user.setCard(card);
        user.setName("Pulkit");
        user.setBankAccount(userBankAccount);


        Atm atm = new Atm();
        atm.setCard(card);
        atm.setAtmBalance(5200);
        atm.setTwoKNotes(2);
        atm.setFiveHundredNotes(2);
        atm.setOneHundredNotes(2);

        atm.getStates().insertCard(atm, card);
        atm.getStates().authenticatePin(atm, 121);
        atm.getStates().selectOperation(atm, TransactionType.CASH_WITHDRAWAL);
        atm.getStates().cashWithdrawal(atm, 3200);
        


    }
}
