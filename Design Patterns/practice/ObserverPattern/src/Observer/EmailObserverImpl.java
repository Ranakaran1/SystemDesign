package Observer;

import Observable.StockObservable;

public class EmailObserverImpl implements NotificationAlertOberver {

    String userName;
    String emailId;
    StockObservable stockObservable;

    public EmailObserverImpl(String userName, String emailId, StockObservable stockObservable) {  
        this.userName = userName;
        this.emailId = emailId;
        this.stockObservable = stockObservable;

    }

    @Override
    public void update() {
        sendEmail(userName, "Product is in stock");
    }

    public void sendEmail(String userName , String Message){
        System.out.println("Email sent to " + userName + " with message " + Message);
    }
    
}
