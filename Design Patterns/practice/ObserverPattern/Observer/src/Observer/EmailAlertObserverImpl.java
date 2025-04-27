package Observer;

import Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    private String email;
    private StockObservable stockObservable;

    public EmailAlertObserverImpl(StockObservable stockObservable, String email) {
        this.email = email;
        this.stockObservable = stockObservable;
    }
    


    @Override
    public void update() {
        System.out.println("Email alert sent to: " + email);
    }

    public void getStockCount(){
        System.out.println("Stock count is: "+ stockObservable.getStockCount());
    }


}
