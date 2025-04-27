package Observer;

import Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver{

    String email;
    StockObservable observable;
    



    public MobileAlertObserver(StockObservable observable,String email) {
        this.email = email;
        this.observable = observable;
    }




    @Override
    public void update() {
        System.out.println("Alert:Mobile, Stock price has changed. : "+ email);
    }

    public void getStockCount(){
        System.out.println("Stock count is: "+ observable.getStockCount());
    }


}
