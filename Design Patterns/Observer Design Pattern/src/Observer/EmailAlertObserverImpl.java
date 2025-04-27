package Observer;

import Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    
    String emailId;
    StockObservable observable;


    public EmailAlertObserverImpl(String email,StockObservable observable ) {
        this.emailId = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId, "prouct added in stock");
    }

    private void sendMail(String email, String msg){
        System.out.println("Sending mail to " + email + " with message " + msg);
    }

}
