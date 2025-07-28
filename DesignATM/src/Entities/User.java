package Entities;

public class User {
    int id;
    Card card;
    UserBankAccount bankAccount;
    String name;

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Card getCard() {
        return card;
    }
    public void setCard(Card card) {
        this.card = card;
    }
    public UserBankAccount getBankAccount() {
        return bankAccount;
    }
    public void setBankAccount(UserBankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    

}
