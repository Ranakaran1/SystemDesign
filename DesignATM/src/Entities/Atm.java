package Entities;

import States.AtmState;
import States.IdleState;

public class Atm {
    AtmState currentStates;
    Card card;

    private int AtmBalance;
    private int twoKNotes;
    private int fiveHundredNotes;
    private int oneHundredNotes;
    
    public Atm(){
        this.currentStates = new IdleState();
    }

   
    

     public Card getCard() {
        return card;
    }
    public void setCard(Card card) {
        this.card = card;
    }

    public AtmState getStates() {
        return currentStates;
    }
    public void setCurrentStates(AtmState states) {
        this.currentStates = states;
    }
    public int getAtmBalance() {
        return AtmBalance;
    }
    public void setAtmBalance(int atmBalance) {
        AtmBalance = atmBalance;
    }
    public int getTwoKNotes() {
        return twoKNotes;
    }
    public void setTwoKNotes(int twoKNotes) {
        this.twoKNotes = twoKNotes;
    }
    public int getFiveHundredNotes() {
        return fiveHundredNotes;
    }
    public void setFiveHundredNotes(int fiveHundredNotes) {
        this.fiveHundredNotes = fiveHundredNotes;
    }
    public int getOneHundredNotes() {
        return oneHundredNotes;
    }
    public void setOneHundredNotes(int oneHundredNotes) {
        this.oneHundredNotes = oneHundredNotes;
    }
    @Override
    public String toString() {
        return "Atm [AtmBalance=" + AtmBalance + ", twoKNotes=" + twoKNotes + ", fiveHundredNotes=" + fiveHundredNotes
                + ", oneHundredNotes=" + oneHundredNotes + "]";
    }

    

    
    
}
