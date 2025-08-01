package Entities;

public class CardPayment implements PaymentMode {

    @Override
    public boolean makePayment() {
       return true;
    }
    
}
