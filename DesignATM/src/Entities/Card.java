package Entities;

public class Card {
    int cvv;
    String cardNumber;
    UserBankAccount userBankAccount;
    int pin = 10010;

    public int getCvv() {
        return cvv;
    }
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public UserBankAccount getUserBankAccount() {
        return userBankAccount;
    }
    public void setUserBankAccount(UserBankAccount userBankAccount) {
        this.userBankAccount = userBankAccount;
    }
    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }

    
    
}
