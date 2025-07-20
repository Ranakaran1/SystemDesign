package Observer;

import Observable.StockObservable;

public class MobileObserverImpl implements NotificationAlertOberver {

    String userName;
    String phone;
    StockObservable stockObservable;

    public MobileObserverImpl(String userName, String phone, StockObservable stockObservable) {  
        this.userName = userName;
        this.phone = phone;
        this.stockObservable = stockObservable;

    }

    @Override
    public void update() {
        sendEmail(phone, "Product is in stock");
    }

    public void sendEmail(String userName , String Message){
        System.out.println("Notification sent to " + phone + " with message " + Message);
    }
    
}

