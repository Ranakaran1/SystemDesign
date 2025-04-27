package Observer;

import Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String username;
    StockObservable observable;


    public MobileAlertObserverImpl(String username, StockObservable observable  ) {
        this.username = username;
        this.observable = observable;
    }


    @Override
    public void update() {
        sendMessageOnMobile(username, "product is in stock");
    }

    private void sendMessageOnMobile(String userName, String mag){
        System.out.println("Send SMS to:" + userName + " with message: " + mag);
    }



}
