import Observable.StockObservable;
import Observer.*;
import Observable.*;

public class App {
    public static void main(String[] args) throws Exception {

        StockObservable stockObservable = new IphoneObserver();
        NotificationAlertOberver notificationAlertOberver = new EmailObserverImpl("karan","karan@company.com",stockObservable);
        NotificationAlertOberver mobilAlertOberver = new MobileObserverImpl("karan","8006063232",stockObservable);

        stockObservable.add(notificationAlertOberver);
        stockObservable.add(mobilAlertOberver);

        stockObservable.setStockCount(5);
        stockObservable.setStockCount(10);
        stockObservable.setStockCount(2);


       
    }
}
